package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String[] cities = new String[] { "Adana" };

		cities = new String[2];
		cities[1] = "Ankara";

		System.out.println(cities[0]);

		ArrayList<String> cities2 = new ArrayList<String>();
		// cities2.size(); 0 vermeli
		cities2.add("Adana");
		cities2.add("Ankara");
		// cities2.remove("Adana");
		cities2.remove(0);

		boolean city = cities2.contains("A");
		System.out.println(cities2.size());
		System.out.println(city);

		MyArrayList<String> cities3 = new MyArrayList<String>();
		cities3.add("Adana");
		cities3.add("Ankara");
		System.out.println(cities3);
		// cities3.remove();
		// System.out.println(cities3.size());
	}

}
