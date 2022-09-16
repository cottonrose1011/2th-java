package starbucks;

import java.util.ArrayList;

public class StarbucksDriver {

	public static void main(String[] args) {
		ArrayList<Starbucks> arrayList = new ArrayList<>();
		
		arrayList.add(new Americano());
		arrayList.add(new Latte());
		
		for(Starbucks starbucks: arrayList) {
			starbucks.printPrice();
		}

	}

}
