package model;
public class Date {

//Atributes
	private String Day;
	private String Month;
	private String Year;

	public User(String day, String month, String year) {
	this.day = day;
	this.month = month;
	this.year = year; 
	}

	//getter method
	public String getDay() {
	return day;
	}
	public String getMonth() {
	return month;
	}
	public String getYear() {
	return year;
	}
	//setter method
	public void setDay(String day) {
		this.day = day;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public void setYear(String year) {
		this.year = year;
	}
}

	



