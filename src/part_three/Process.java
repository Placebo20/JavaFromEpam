package part_three;

import part_three.entity.Citizen;
import part_three.entity.Human;
import part_three.entity.Student;
import part_three.service.Address;
import part_three.service.BirthDate;

public class Process {
	public static void main(String[] args) {
		BirthDate buff = new BirthDate(8, 11, 2001);
		Human human1 = new Human("Dmytriy", "Serheevich", "Hushcha", buff);
		System.out.println(human1.toString());
		
		Address address = new Address("Ukraine", "Chernihiv", "Horodnya", "Vasilya Chumaka", "3/13");
		Citizen citizen1 = new Citizen("Dmytriy", "Serheevich", "Hushcha", buff, address, "+380992310086");
		System.out.println(citizen1.toString());
		
		Student student1 = new Student("Dmytriy", 
				"Serheevich", 
				"Hushcha", 
				buff, 
				address, 
				"+380992310086", 
				"Selfstudy",
				"3",
				"OwnGroup-31"
				);
		System.out.println(student1.toString());
	}
}
