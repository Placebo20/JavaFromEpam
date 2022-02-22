package part_three.entity;

import part_three.service.BirthDate;

public class Human {
	private String firstName;
	private String lastName;
	private String patronymic;
	private BirthDate birthDate;
	
	public Human() {
		this.firstName = "unknown";
		this.lastName = "unknown";
		this.patronymic = "unknown";
		this.birthDate = new BirthDate();
	}
	
	public Human(String firstName, String patronymic, String lastName, BirthDate birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymic = patronymic;
		this.birthDate = new BirthDate(birthDate.getDay() , birthDate.getMonth(), birthDate.getYear());
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public void setBirthDate(byte dayOfBirth, byte monthOfBirth, int yearOfBirth) {
		this.birthDate = new BirthDate(dayOfBirth, monthOfBirth, yearOfBirth);
	}
	
	protected String getfirstName() {return firstName;}
	protected String getLastName() {return lastName;}
	protected String getPatronymic() {return patronymic;}
	protected BirthDate getBirthDate() {return birthDate;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName).append(' ').append(patronymic).append(' ').append(lastName);
		sb.append(" ").append(birthDate.toString());
		return sb.toString();
	}
}
