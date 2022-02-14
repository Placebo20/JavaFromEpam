package part_one;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		System.out.println("Hushcha " + formatter.format(date));
		date = new Date(System.currentTimeMillis());
		System.out.println(formatter.format(date));
	}
}
