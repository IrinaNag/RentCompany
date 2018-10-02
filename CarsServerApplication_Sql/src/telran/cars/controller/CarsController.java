package telran.cars.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import telran.cars.dto.*;
import telran.cars.service.*;

@RestController
public class CarsController {
	@Autowired
	IRentCompany company;
//POST requests
	@PostMapping(value = CarsApiConstants.ADD_CAR)
	CarsReturnCode addCar(@RequestBody Car car) {
		return company.addCar(car);
	}

	@PostMapping(value = CarsApiConstants.ADD_CAR_MODEL)
	CarsReturnCode addCarModel(@RequestBody Model carModel) {
		return company.addModel(carModel);
	}
	@PostMapping(value = CarsApiConstants.ADD_DRIVER)
	CarsReturnCode addDriver(@RequestBody Driver driver) {
		return company.addDriver(driver);
	}
	@PostMapping(value = CarsApiConstants.CLEAR_CARS)
	List<Car> clearCars(@RequestBody DateDays dd) {
		return company.clear(dd.date, dd.days);
	}
	@PostMapping(value = CarsApiConstants.RENT_CAR)
	CarsReturnCode rentCar(@RequestBody RentRecord record) {
		return company.rentCar(record.getCarNumber(), record.getLicenseId(), record.getRentDate(),
				record.getRentDays());
	}

	@PostMapping(value = CarsApiConstants.RETURN_CAR)
	CarsReturnCode returnCar(@RequestBody RentRecord record) {
		return company.returnCar(record.getCarNumber(), record.getLicenseId(), record.getReturnDate(),
				record.getGasTankPercent(), record.getDamages());
	}
	//DELETE requests
	@DeleteMapping(value = CarsApiConstants.REMOVE_CAR)
	CarsReturnCode removeCar(@PathVariable String carNumber) {
		return company.removeCar(carNumber);
	}
	//GET requests
	@GetMapping(value = CarsApiConstants.GET_MODEL)
	Model getModel(String modelName) {
		return company.getModel(modelName);
	}

	@RequestMapping(value = CarsApiConstants.GET_CAR)
	Car getCar(String carNumber) {
		return company.getCar(carNumber);
	}

	@RequestMapping(value = CarsApiConstants.GET_DRIVER)
	Driver getCar(long licenseId) {
		return company.getDriver(licenseId);
	}

	@RequestMapping(value = CarsApiConstants.GET_ALL_CARS)
	List<Car> getAllCars() {
		return company.getAllCars().collect(Collectors.toList());
	}

	@RequestMapping(value = CarsApiConstants.GET_ALL_DRIVERS)
	List<Driver> getAllDrivers() {
		return company.getAllDrivers().collect(Collectors.toList());
	}

	@RequestMapping(value = CarsApiConstants.GET_ALL_RECORDS)
	List<RentRecord> getAllRecords() {
		return company.getAllRecords().collect(Collectors.toList());
	}
	@RequestMapping(value = CarsApiConstants.GET_ALL_MODELS)
	List<String> getAllModels() {
		return company.getAllModelNames();
	}
	@GetMapping(value = CarsApiConstants.GET_CAR_DRIVERS)
	List<Driver> getCarDrivers(String carNumber) {
		return company.getCarDrivers(carNumber);
	}

	@GetMapping(value = CarsApiConstants.GET_DRIVER_CARS)
	List<Car> getDriverCars(long licenseId) {
		return company.getDriverCars(licenseId);
	}

	@GetMapping(value = CarsApiConstants.MOST_POPULAR_MODELS)
	Iterable<String> getMostPopularCarModels() {
		return company.getMostPopularModelNames();
	}
	@GetMapping(value = CarsApiConstants.MOST_PROFIT_MODELS)
	Iterable<String> getMostProfitCarModels() {
		return company.getMostProfitModelNames();
	}

}
