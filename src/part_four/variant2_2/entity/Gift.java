package part_four.variant2_2.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Gift implements Iterable<Sweet>{
	
	private List<Sweet> list;
	public Gift(List<Sweet> list) {this.list = list;}
	public Gift() {list = new ArrayList<Sweet>();}
	
	public void setSweetsList(List<Sweet> list) {this.list = list;}
	public <T extends Sweet>void putSweet(T sweet){list.add(sweet);}
	
	public Sweet showSweet(int index){return list.get(index);}
	public void eatSweet(int index){list.remove(index);}
	
	public int getPresentSweetsCount(){return list.size();}
	
	public List<Sweet> getSweetsWithShugarAmountInRange(int from, int to) {
		List<Sweet> sugarList = new ArrayList<>();
		for (Sweet sweet : list) {
			if (sweet.getSugarCount() >= from && sweet.getSugarCount() <= to)
				sugarList.add(sweet);
		}
		return sugarList;
	}

	public void sortByWeight() {
		Collections.sort(list, new Comparator<Sweet>() {
			@Override
			public int compare(Sweet o1, Sweet o2) {return o1.getWeight() - o2.getWeight();}
		});

	}

	public int getGiftWeight() {
		int weight = 0;
		for (Sweet sweets : list) {weight += sweets.getWeight();}
		return weight;
	}

	@Override
	public Iterator<Sweet> iterator() {
		return list.iterator();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Sweet sweet : list) {
			sb.append(sweet.toString());
		}
		return sb.toString();
	}
}
