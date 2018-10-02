package telran.cars.dto;

import java.time.LocalDate;

public class DateDays {
public LocalDate date;
public int days;
public DateDays(LocalDate date, int days) {
	super();
	this.date = date;
	this.days = days;
}
public DateDays() {}
public LocalDate getDate() {
	return date;
}
public int getDays() {
	return days;
}

}
