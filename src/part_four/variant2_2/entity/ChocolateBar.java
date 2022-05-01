package part_four.variant2_2.entity;

public class ChocolateBar extends Sweet {
	private boolean porous;
	private int cocoaCount;
	private ChocolateType type;
	
	public ChocolateBar(String title, String manufacturer, int weight, int sugarCount, boolean porous, int cocoaCount, ChocolateType type) {
		super(title,manufacturer,weight,sugarCount);
		this.porous = porous;
		this.cocoaCount = cocoaCount;
		this.type = type;
	}
	
	public ChocolateBar() {
		super("","",0,0);
		porous = false;
		cocoaCount = 0;
		type = null;
	}
	
	public boolean isPorous() {return porous;}
	public int getCocoaCount() {return cocoaCount;}
	public ChocolateType getChocolateType() {return type;}

	public void setPorous(boolean porous) {this.porous = porous;}
	public void setCocoaCount(int newCocoaCount) {cocoaCount = newCocoaCount;}
	public void setChocolateType(ChocolateType chocolateType) {type = chocolateType;}
	public void setChocolateBar(boolean porous, int cocoaCount, ChocolateType type) {
		this.porous = porous;
		this.cocoaCount = cocoaCount;
		this.type = type;
	}
	public void setChocolateBar(ChocolateBar bar) {
		this.setSweet(bar.getTitle(),bar.getManufacturer(),bar.getWeight(),bar.getSugarCount());
		this.porous = bar.porous;
		this.cocoaCount = bar.cocoaCount;
		this.type = bar.type;
	}
	
	
}
