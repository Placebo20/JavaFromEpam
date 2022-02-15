package part_one;

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countOfNums = s.nextInt();
		int array[] = new int[countOfNums];
		for(int i = 0; i < countOfNums; i++) {
			array[i] = s.nextInt();
		}
		System.out.print("x % 3 = 0: ");
		for(int i = 0; i < countOfNums; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.print("\nx % 9 = 0: ");
		for(int i = 0; i < countOfNums; i++) {
			if(array[i] % 9 == 0) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
