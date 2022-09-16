package fighter;

import java.util.ArrayList;

public class FighterDriver {

	public static void main(String[] args) {
		ArrayList<Fighter> arrayList = new ArrayList<>();
		
		arrayList.add(new F22());
		arrayList.add(new KF21());
		
		for(Fighter fighter : arrayList) {
			fighter.printPossessingCountry();
		}
	}
}
