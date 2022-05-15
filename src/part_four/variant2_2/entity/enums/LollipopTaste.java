package part_four.variant2_2.entity.enums;

public enum LollipopTaste {
	APPLE,
	CHERRY,
	STRAWBERRY,
	LEMON,
	CHOCOLATE_VANILA,
	COCA_COLA;
	
	@Override
	public String toString() {
		String type = "";
		switch(ordinal()) {
		case 0:
			type = "Apple";
			break;
		case 1:
			type = "Cherry";
			break;
		case 2:
			type = "Strawberry";
			break;
		case 3:
			type = "Lemon";
			break;
		case 4:
			type = "Chocolate-vanila";
			break;
		case 5:
			type = "Coca-cola";
			break;
		default:
			type = "";
			break;
		}
		return type;
	}
}
