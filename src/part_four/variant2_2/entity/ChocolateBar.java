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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(type + " ");
		if(porous = true) sb.append("porous, ");
		sb.append("cocoa count is " + cocoaCount + "");
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChocolateBar other = (ChocolateBar) obj;
		if (this.getManufacturer() == null) {
			if (other.getManufacturer() != null)
				return false;
		} else if (!this.getManufacturer().equals(other.getManufacturer()))
			return false;
		if (this.getTitle() == null) {
			if (other.getTitle() != null)
				return false;
		} else if (!this.getTitle().equals(other.getTitle()))
			return false;
		if (this.getSugarCount() != other.getSugarCount())
			return false;
		if (this.getWeight() != other.getWeight())
			return false;
		if(porous != other.porous)
			return false;
		if(cocoaCount != other.cocoaCount)
			return false;
		if(type != other.type)
			return false;
		return true;
	}
	
}
