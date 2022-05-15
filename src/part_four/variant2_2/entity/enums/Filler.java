package part_four.variant2_2.entity.enums;

public enum Filler {
	CHERRY_JAM,
	APRICOT_JAM,
	APPLE_JAM,
	CHOCOLATE_CREAM,
	MILK_CREAM,
	GUM;
	
	@Override
	public String toString() {
		String type = "";
		switch(ordinal()) {
		case 0:
			type = "Cherry jam";
			break;
		case 1:
			type = "Apricot Jam";
			break;
		case 2:
			type = "Apple Jam";
			break;
		case 3:
			type = "Chocolate Cream";
			break;
		case 4:
			type = "Milk Cream";
			break;
		case 5:
			type = "Gum";
			break;
		default:
			type = "";
			break;
		}
		return type;
	}
}
