package part_four.variant2_1.process;

import part_four.variant2_1.entity.*;
import part_four.variant2_1.process.*;

public class Main {

	public static void main(String[] args) {
		Flower f1 = new Flower("Rose", 4, 5, 20);
		Flower f2 = new Flower("Rose", 3, 5, 20);
		Flower f3 = new Flower("Rose", 1, 5, 20);
		Bouquet b1 = new Bouquet();
		b1.addFlower(f1);
		b1.addFlower(f2);
		b1.addFlower(f3);
		System.out.println(b1.toString());
		Processes proc = new Processes();
		proc.sortByFreshness(b1);
		System.out.println(b1.toString());
	}

}
