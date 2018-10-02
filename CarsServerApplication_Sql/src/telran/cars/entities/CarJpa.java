package telran.cars.entities;
import java.util.List;

import javax.persistence.*;

import telran.cars.dto.State;
@Table(name="cars")
@Entity
public class CarJpa {
public CarJpa(String regNumber, String color, State state, boolean inUse, boolean flRemoved, ModelJpa model) {
		super();
		this.regNumber = regNumber;
		this.color = color;
		this.state = state;
		this.inUse = inUse;
		this.flRemoved = flRemoved;
		this.model = model;
	}
@Id
private String regNumber;
private String color;
@Enumerated(EnumType.STRING)
private State state;
private boolean inUse;
private boolean flRemoved;
@ManyToOne
private ModelJpa model;
@OneToMany(mappedBy="car",cascade=CascadeType.REMOVE)//physical removing car will cause removing
//all related records
List<RecordJpa> records;
public List<RecordJpa> getRecords() {
	return records;
}
public CarJpa() {}
public State getState() {
	return state;
}
public void setState(State state) {
	this.state = state;
}
public boolean isInUse() {
	return inUse;
}
public void setInUse(boolean inUse) {
	this.inUse = inUse;
}
public boolean isFlRemoved() {
	return flRemoved;
}
public void setFlRemoved(boolean flRemoved) {
	this.flRemoved = flRemoved;
}
public String getRegNumber() {
	return regNumber;
}
public String getColor() {
	return color;
}
public ModelJpa getModel() {
	return model;
}


}
