package part_three.entity;

import part_three.service.Address;
import part_three.service.BirthDate;

public class Citizen extends Human{
	
	private Address address;
	private String phone;

	public Citizen() {
		super("unknow", "unknow", "unknow", new BirthDate());
		this.address = new Address();
		this.phone = "unknow";
	}
	
	public Citizen(String firstName, String lastName, String patronymic, BirthDate birthDate, Address address, String phone) {
		super(firstName, lastName, patronymic, birthDate);
		this.address = new Address();
		this.address.setAddress(address);
		this.phone = phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAdress(Address address) {
		this.address.setAddress(address);
	}
	
	public Address getAddress() {return address;}
	public String getPhone() {return phone;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("=======================\n");
		sb.append(this.getfirstName()).append(' ').append(this.getPatronymic()).append(' ').append(this.getLastName());
		sb.append('\n').append(this.getBirthDate().toString());
		sb.append('\n').append(this.getAddress().toString());
		sb.append('\n').append(phone);
		return sb.toString();
	}
}
