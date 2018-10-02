package telran.cars.entities;
import java.time.LocalDate;

import javax.persistence.*;
@Table(name="carrecords")
@Entity

public class RecordJpa {

@Id
@GeneratedValue
private int id;
@ManyToOne
private DriverJpa driver;
@ManyToOne
private CarJpa car;
private LocalDate rentDate;
private LocalDate returnDate;
private int gasTankPercent;
private int rentDays;
private float cost;
public void setCost(float cost) {
	this.cost = cost;
}
private int damages;
public RecordJpa() {}
public LocalDate getReturnDate() {
	return returnDate;
}
public void setReturnDate(LocalDate returnDate) {
	this.returnDate = returnDate;
}
public int getGasTankPercent() {
	return gasTankPercent;
}
public void setGasTankPercent(int gasTankPercent) {
	this.gasTankPercent = gasTankPercent;
}
public int getDamages() {
	return damages;
}
public void setDamages(int damages) {
	this.damages = damages;
}
public int getId() {
	return id;
}
public DriverJpa getDriver() {
	return driver;
}
public CarJpa getCar() {
	return car;
}
public LocalDate getRentDate() {
	return rentDate;
}
public int getRentDays() {
	return rentDays;
}
public float getCost() {
	return cost;
}
public RecordJpa(DriverJpa driver, CarJpa car, LocalDate rentDate, int rentDays) {
	super();
	this.driver = driver;
	this.car = car;
	this.rentDate = rentDate;
	this.rentDays = rentDays;
}

}
