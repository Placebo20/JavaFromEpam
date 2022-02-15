package part_one;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countOfNums = s.nextInt();
		int array[] = new int[countOfNums];
		for(int i = 0; i < countOfNums; i++) {
			array[i] = s.nextInt(); 
		}
		for(int i = 0; i < countOfNums; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
		for(int i = 0; i < countOfNums; i++) {
			if(array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
