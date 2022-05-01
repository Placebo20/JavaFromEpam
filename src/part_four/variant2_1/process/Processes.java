package part_four.variant2_1.process;

import part_four.variant2_1.entity.*;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class Processes {
	public void sortByFreshness(Bouquet bouquet) {
		int len = bouquet.getBouquet().size();
		String[] freshnessDegree = bouquet.getBouquet().elementAt(0).freshnessDegree;
		int first = 0, next = 0;
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - i - 1; j++) {
				for(int k = 0; k < freshnessDegree.length; k++) {
					if(bouquet.getBouquet().elementAt(j).getFreshness() == freshnessDegree[k]) {
						first = k;
					}
					if(bouquet.getBouquet().elementAt(j+1).getFreshness() == freshnessDegree[k]) {
						next = k;
					}
					if(first != 0 && next != 0) {
						break;
					}
				}
				if(first > next) {
					
					Flower swap = new Flower();
					swap.setFlower(bouquet.getBouquet().elementAt(j));
					bouquet.getBouquet().elementAt(j).setFlower(bouquet.getBouquet().elementAt(j+1));
					bouquet.getBouquet().elementAt(j+1).setFlower(swap);
				}
			}
		}
	}
	
	public void chooseFromStemLengthRange(Bouquet bouquet, int min, int max) {
		Vector<Flower> flowersVector = bouquet.getBouquet();
		for(int i = 0; i < flowersVector.size(); i++) {
			if(flowersVector.elementAt(i).getPrice() >= min || flowersVector.elementAt(i).getPrice() <= max) {
				System.out.println(flowersVector.elementAt(i).toString());
			}
		}
	}
}
