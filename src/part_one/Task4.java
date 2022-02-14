package part_one;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String byDefault = "qweasdzxc";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		if(str.equals(byDefault)) {
			System.out.println("Password is correct");
		} else {
			
			System.out.println("Password isn't correct");
		}
	}

}
