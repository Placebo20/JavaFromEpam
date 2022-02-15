package part_one;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countOfNums = s.nextInt();
		int array[] = new int[countOfNums];
		for(int i = 0; i < countOfNums; i++) {
			array[i] = s.nextInt();
		}
		int min = array[0], max = array[0];
		for(int i = 1; i < countOfNums; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min = " + min + "; Max = " + max + ";");
	}

}
