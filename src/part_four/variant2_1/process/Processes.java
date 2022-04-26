package part_four.variant2_1.process;

import part_four.variant2_1.entity.*;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class Processes {
	public void sortByFreshness(Bouquet bouquet) {}
	public void chooseFromStemLengthRange(Bouquet bouquet, int min, int max) {
		Vector<Flower> flowersVector = bouquet.getBouquet();
		for(int i = 0; i < flowersVector.size(); i++) {
			if(flowersVector.elementAt(i).getPrice() >= min || flowersVector.elementAt(i).getPrice() <= max) {
				System.out.println(flowersVector.elementAt(i).toString());
			}
		}
	}
}
