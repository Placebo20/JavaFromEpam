package part_one;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countOfNums = s.nextInt();
		int array[] = new int[countOfNums];
		for(int i = 0; i < countOfNums; i++) {
			array[i] = s.nextInt();
		}
		System.out.print("x % 3 = 0: ");
		for(int i = 0; i < countOfNums; i++) {
			if(array[i] % 5 == 0 && array[i] % 7 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
