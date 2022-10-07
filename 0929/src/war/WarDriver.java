package war;

import java.util.ArrayList;

public class WarDriver {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<>();
		
		arrayList.add(new King());
		arrayList.add(new Queen());
		arrayList.add(new King());
		
		for(Character c: arrayList) {
			c.fight();
		}
	}

}
