package part_three.entity;

import part_three.service.Address;
import part_three.service.BirthDate;

public class Student extends Citizen{
	private static int ID;
	private int id;
	private String faculty;
	private String course;
	private String group;
	
	public Student(String firstName, 
			String lastName, 
			String patronymic, 
			BirthDate birthDate, 
			Address address,
			String phone,
			String faculty, 
			String course,
			String group
			) {
		super(firstName, lastName, patronymic, birthDate, address, phone);
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}
	
	public Student() {
		super();
		this.faculty = "unknow";
		this.course = "unknow";
		this.group = "unknow";
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	public String getFaculty() {return faculty;}
	public String getCourse() {return course;}
	public String getGroup() {return group;}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("=======================\n");
		sb.append(getfirstName()).append(' ').append(getPatronymic()).append(' ').append(getLastName());
		sb.append('\n').append(getBirthDate().toString());
		sb.append('\n').append(getAddress().toString());
		sb.append('\n').append(getPhone());
		sb.append('\n').append(faculty).append(", ").append(course).append(" course, group ").append(group);
		return sb.toString();
	}
}
