package part_four.variant2_1.entity;

public class Flower {
	
	final public String[] freshnessDegree = new String[] {"Very fresh", "Fresh", "Middle fresh", "Not fresh", "Rotting"};
	
	private String title;
	private String freshness;
	private int price;
	private int stemLength;

	public Flower() {
		title = "";
		freshness = null;
		price = 0;
		stemLength = 0;
	}
	
	public Flower(String title, int freshnessNum, int price, int stemLength) {
		this.title = title;
		this.freshness = freshnessDegree[freshnessNum];
		this.price = price;
		this.stemLength = stemLength;
	}
	
	public void setFlower(Flower newFlower) {
		title = newFlower.title;
		freshness = newFlower.freshness;
		price = newFlower.price;
		stemLength = newFlower.stemLength;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setFreshness(int freshnessNum) {
		freshness = freshnessDegree[freshnessNum];
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public void setStemLength(int newStemLength) {
		stemLength = newStemLength;
	}
	
	public String getTitle() {return title;}
	public String getFreshness() {return freshness;}
	public int getPrice() {return price;}
	public int getStemLength() {return stemLength;}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[" + title + ", " + freshness + ", " + price + "$, length of stem is " + stemLength + "cm]");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob.toString().equals(this.toString())){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int asciiSum = 0;
		for(int i = 0; i < title.toString().length(); i++) {
			asciiSum += (int) title.charAt(i);
		}
		return asciiSum + price + stemLength;
	}
}
