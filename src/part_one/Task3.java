package part_one;

import java.util.Scanner;
import java.util.Random;
public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countOfNums = scanner.nextInt();
		for(int i = 0; i < countOfNums; i++){
			System.out.print((int)(Math.random() * 100) + " ");			
		}
		System.out.println();
		for(int i = 0; i < countOfNums; i++){
			System.out.println((int)(Math.random() * 100));			
		}
	}

}
