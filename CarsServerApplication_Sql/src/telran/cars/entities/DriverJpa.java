package telran.cars.entities;
import java.util.List;

import javax.persistence.*;
@Table(name="drivers")
@Entity
public class DriverJpa {
@Id
private long licenseId;
private String name;
private int birthYear;
private String phone;
@OneToMany(mappedBy="driver")
List<RecordJpa> records;
public DriverJpa() {}
public DriverJpa(long licenseId, String name, int birthYear, String phone) {
	super();
	this.licenseId = licenseId;
	this.name = name;
	this.birthYear = birthYear;
	this.phone = phone;
}
public long getLicenseId() {
	return licenseId;
}
public String getName() {
	return name;
}
public int getBirthYear() {
	return birthYear;
}
public String getPhone() {
	return phone;
}
public List<RecordJpa> getRecords() {
	return records;
}

}
