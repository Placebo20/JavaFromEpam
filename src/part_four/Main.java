package part_four;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Text text = new Text();
		Sentence title = new Sentence("1984");
		Vector<Sentence> vec = new Vector<Sentence>();
		Sentence sen = new Sentence("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		vec.add(sen);
		text.setTitle(title);
		text.setText(vec);
	}
}
