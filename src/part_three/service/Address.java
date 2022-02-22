package part_three.service;

public class Address {
	private String country;
	private String region;
	private String locality;
	private String street;
	private String house;
	
	public Address() {
		this.country = "unknow";
		this.region = "unknow";
		this.locality = "unknow";
		this.street = "unknow";
		this.house = "unknow";
	}
	
	public Address(String country, String region, String locality, String street, String house) {
		this.country = country;
		this.region = region;
		this.locality = locality;
		this.street = street;
		this.house = house;
	}
	
	public void setAddress(String country, String region, String locality, String street, String house) {
		this.country = country;
		this.region = region;
		this.locality = locality;
		this.street = street;
		this.house = house;
	}
	
	public void setAddress(Address address) {
		this.country = address.country;
		this.region = address.region;
		this.locality = address.locality;
		this.street = address.street;
		this.house = address.house;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	
	public String getCountry () {return country;}
	public String getRegion () {return region;}
	public String getLocality () {return locality;}
	public String getStreet() {return street;}
	public String getHouse() {return house;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(country).append(", ");
		sb.append(region).append(" region, ");
		sb.append(locality).append(", ");
		sb.append(street).append(" street, ");
		sb.append(house);
		
		return sb.toString();
	}
	
}
