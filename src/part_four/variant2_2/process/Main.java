package part_four.variant2_2.process;

import part_four.variant2_2.entity.*;
import part_four.variant2_2.entity.enums.ChocolateType;
import part_four.variant2_2.entity.enums.Filler;
import part_four.variant2_2.entity.enums.LollipopTaste;

public class Main {

	public static void main(String[] args) {
		Gift gift = new Gift();
		Lollipop l1 = new Lollipop("LollipopOne", "Roshen", 10, 5, "Red", LollipopTaste.CHERRY, Filler.CHERRY_JAM);
		gift.putSweet(l1);
		Lollipop l2 = new Lollipop("LollipopTwo", "Roshen", 10, 5, "Green", LollipopTaste.APPLE, Filler.APPLE_JAM);
		gift.putSweet(l2);
		
		ChocolateBar b1 = new ChocolateBar("ChocolateBarOne", "Roshen", 20, 5, true, 10, ChocolateType.MILK, null);
		gift.putSweet(b1);
		
		System.out.println(gift.getGiftWeight());
		System.out.println(gift.toString());
		gift.sortByWeight();
		System.out.println(gift.toString());
	}

}
