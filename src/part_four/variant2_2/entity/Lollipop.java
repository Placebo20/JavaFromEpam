package part_four.variant2_2.entity;

import part_four.variant2_2.entity.enums.Filler;
import part_four.variant2_2.entity.enums.LollipopTaste;

public class Lollipop extends Sweet{
	private String color;
	private LollipopTaste lollipopTaste;
	private Filler filler;
	
	public Lollipop(String title, String manufacturer, int weight, int sugarCount, String color, LollipopTaste lollipopTaste, Filler filler) {
		super(title, manufacturer, weight, sugarCount);
		this.color = color;
		this.lollipopTaste = lollipopTaste;
		this.filler = filler;
	}
	
	public Lollipop() {
		super();
		this.color = "";
		this.lollipopTaste = null;
		this.filler = null;
	}
	
	public String getColor() {return color;}
	public LollipopTaste getLollipopTaste() {return lollipopTaste;}
	public Filler getFiller() {return filler;}
	
	public void setColor(String newColor) {this.color = newColor;}
	public void setLollipopTaste(LollipopTaste newLollipopTaste) {this.lollipopTaste = newLollipopTaste;}
	public void setFiller(Filler newFiller) {this.filler = newFiller;}
	public void setLollipop(Lollipop other) {
		this.title = other.title;
		this.manufacturer = other.manufacturer;
		this.weight = other.weight;
		this.sugarCount = other.sugarCount;
		this.color = other.color;
		this.lollipopTaste = other.lollipopTaste;
		this.filler = other.filler;
	}
	public void setLollipop(String title, String manufacturer, int weight, int sugarCount, String color, LollipopTaste lollipopTaste, Filler filler) {
		this.title = title;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.sugarCount = sugarCount;
		this.color = color;
		this.lollipopTaste = lollipopTaste;
		this.filler = filler;
	}
	
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(color + " color");
		sb.append("with " + this.filler + " filler");
		sb.append("lolipop taste is " + lollipopTaste + "");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		Lollipop other = (Lollipop) obj;
		if (this.getManufacturer() == null) {
			if (other.getManufacturer() != null)
				return false;
		} else if (!this.getManufacturer().equals(other.getManufacturer()))
			return false;
		if (this.getTitle() == null) {
			if (other.getTitle() != null)return false;
		} else if (!this.getTitle().equals(other.getTitle()))return false;
		if (this.getSugarCount() != other.getSugarCount())return false;
		if (this.getWeight() != other.getWeight())return false;
		if(color != other.color)return false;
		if(lollipopTaste != other.lollipopTaste) return false;
		if(filler != other.filler)return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		int asciiSum = super.hashCode();
		String wordsSum = color + lollipopTaste.name() + filler.name();
		for(int i = 0; i < wordsSum.length(); i++) {
			asciiSum += (int) wordsSum.charAt(i);
		}
		return asciiSum;
	}
}
