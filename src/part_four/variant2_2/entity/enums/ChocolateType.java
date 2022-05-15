package part_four.variant2_2.entity.enums;

public enum ChocolateType {
	MILK,
	DARK,
	WHITE;
	
	@Override
	public String toString() {
		String type = "";
		switch(ordinal()) {
		case 0:
			type = "Milk";
			break;
		case 1:
			type = "Dark";
			break;
		case 2:
			type = "White";
			break;
		default:
			type = "";
			break;
		}
		return type;
	}
	
}
