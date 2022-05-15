package part_four.variant2_2.entity;

import part_four.variant2_2.entity.enums.Filler;

public class Lollipop extends Sweet{
	private String color;
	private String shellTaste;
	private Filler filler;
	
	public Lollipop(String title, String manufacturer, int weight, int sugarCount) {
		super(title, manufacturer, weight, sugarCount);
	}
}
