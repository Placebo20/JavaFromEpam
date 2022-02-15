package part_one;

import java.util.stream.*;
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int countOfNums = s.nextInt();
		int array[] = new int[countOfNums];
		for(int i = 0; i < countOfNums; i++) {
			array[i] = s.nextInt();
		}
	    for (int i = 0; i < countOfNums; i++){
	        if(checkSimple(array[i]))
	            System.out.print(array[i] + " ");
	    }
	}

	public static boolean checkSimple(int i){
	    if (i<=1)
	        return false;
	    else if (i <=3)
	        return true;
	    else if (i%2==0 || i %3 ==0)
	        return false;
	    int n = 5;
	    while (n*n <=i){
	        if (i % n ==0 || i % (n+2) == 0)
	            return false;
	        n=n+6;
	    }
	    return true;
	}
}
