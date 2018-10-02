package telran.cars.entities;
import java.util.List;

import javax.persistence.*;
@Table(name="carmodels")
@Entity
public class ModelJpa {
public ModelJpa(String modelName, int gasTank, String company, String country, int priceDay) {
		super();
		this.modelName = modelName;
		this.gasTank = gasTank;
		this.company = company;
		this.country = country;
		this.priceDay = priceDay;
	}
@Id
private String modelName;
private int gasTank;
private String company;
private String country;
private int priceDay;
@OneToMany(mappedBy="model",cascade=CascadeType.REMOVE)
List<CarJpa> cars;
public ModelJpa() {}
public int getPriceDay() {
	return priceDay;
}
public void setPriceDay(int priceDay) {
	this.priceDay = priceDay;
}
public String getModelName() {
	return modelName;
}
public int getGasTank() {
	return gasTank;
}
public String getCompany() {
	return company;
}
public String getCountry() {
	return country;
}
public List<CarJpa> getCars() {
	return cars;
}

}

