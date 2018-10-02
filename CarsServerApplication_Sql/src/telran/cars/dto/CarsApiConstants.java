package telran.cars.dto;

public interface CarsApiConstants {
	//POST requests
String ADD_CAR="/car"; //POST
String ADD_CAR_MODEL="/model"; //POST
String ADD_DRIVER="/driver"; //POST
String CLEAR_CARS="/cars";//POST
String RENT_CAR="/car/rent";//POST
String RETURN_CAR="/car/return";//POST
//DELETE requests
String REMOVE_CAR="/car/{carNumber}";//DELETE
//GET requests
String GET_ALL_CARS="/cars";//GET
String GET_ALL_DRIVERS="/drivers";//GET
String GET_ALL_MODELS="/models";//GET
String GET_ALL_RECORDS="/records";//GET
String GET_CAR="/car";//GET
String GET_DRIVER="/driver";//GET
String GET_MODEL="/model";//GET
String GET_DRIVER_CARS="/driver/cars";//GET
String GET_CAR_DRIVERS="/car/drivers";//GET
String MOST_POPULAR_MODELS = "/models/popular";//GET
String MOST_PROFIT_MODELS = "/models/profit";//GET

}
