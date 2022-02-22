package part_three.service;

public class BirthDate {
	private int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int day;
	private int month;
	private int year;
	private boolean isBC;
	
	public BirthDate() {
		this.day = 1;
		this.month = 1;
		this.year = 1970;
		this.isBC = false;
	}
	
	public BirthDate(int day, int month, int year) {
		if(year % 4 == 0) {
			daysInMonth[1] = 29;
		}
		if(daysInMonth[month-1] < day) {
			System.out.println("In " + month + " month only " + daysInMonth[month-1] + " days, try again");
			return;
		}
		this.day = day;
		this.month = month;
		if(year < 0) {
			isBC = true;
		}
		this.year = Math.abs(year);
	}
	
	public void setDay(int day) {
		if(daysInMonth[this.month-1] < day) {
			System.out.println("In " + this.month + " month only " + daysInMonth[this.month-1] + " days, try again");
			return;
		}
		this.day = day;
	}
	
	public void setMonth(int month) {
		if(month > this.month || month < 1) {
			System.out.println("Incorrect value of month, try again");
		}
		if(this.day > daysInMonth[month]){
			this.day = daysInMonth[month];
		}
		this.month = month;
	}
	
	public void setYear(int year) {
		if(year < 0) {
			isBC = true;
		}
		this.year = Math.abs(year);
	}
	
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		if(day < 10) {sb.append('0').append(day);}
		else {sb.append(day);}
		sb.append('.');
		if(month < 10) { sb.append('0').append(month); }
		else {sb.append(month);}
		sb.append('.').append(year);		
		if(isBC){sb.append(" B.C.");}
		
		return sb.toString();
	}
}
