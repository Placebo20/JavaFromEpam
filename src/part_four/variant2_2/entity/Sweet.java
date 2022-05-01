package part_four.variant2_2.entity;

public class Sweet {
	private String title;
	private String manufacturer;
	private int weight;
	private int sugarCount;
	
	public Sweet(String title, String manufacturer, int weight, int sugarCount) {
		this.title = title;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.sugarCount = sugarCount;
	}
	
	public Sweet() {
		title = new String();
		manufacturer = new String();
		weight = 0;
		sugarCount = 0;
	}
	
	public String getTitle() {return title;}
	public String getManufacturer() {return manufacturer;}
	public int getSugarCount() {return sugarCount;}
	public int getWeight() {return weight;}
	
	public void setTitle(String newTitle) {title = newTitle;}
	public void setManufacturer(String newManufacturer) {manufacturer = newManufacturer;}
	public void setWeight(int newWeight) {weight = newWeight;}
	public void setSugarCount(int newSugarCount) {sugarCount = newSugarCount;}
	public void setSweet(Sweet sweet) {
		title = sweet.title;
		manufacturer = sweet.manufacturer;
		weight = sweet.weight;
		sugarCount = sweet.sugarCount;
	}
	public void setSweet(String title, String manufacturer, int weight, int sugarCount) {
		this.title = title;
		this.manufacturer = manufacturer;
		this.weight = weight;
		this.sugarCount = sugarCount;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + manufacturer + "] " + title + " " + weight + "g, amount of sugar is " + sugarCount + "%\n");
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		String wordsSum = title + manufacturer;
		for(int i = 0; i < wordsSum.length(); i++) {
			asciiSum += (int) wordsSum.charAt(i);
		}
		asciiSum += weight;
		asciiSum += sugarCount;
		return asciiSum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (sugarCount != other.sugarCount)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
}

