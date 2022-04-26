package part_four.variant2_1.entity;

public class Flower {
	
	private String title;
	private FreshnessDegree freshness;
	private int price;
	private int stemLength;

	public Flower() {
		title = "";
		freshness = null;
		price = 0;
		stemLength = 0;
	}
	
	public Flower(String title, FreshnessDegree freshness, int price, int stemLength) {
		this.title = title;
		this.freshness = freshness;
		this.price = price;
		this.stemLength = stemLength;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setFreshness(FreshnessDegree newFreshness) {
		freshness = newFreshness;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public void setStemLength(int newStemLength) {
		stemLength = newStemLength;
	}
	
	public String getTitle() {return title;}
	public FreshnessDegree getFreshness() {return freshness;}
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
