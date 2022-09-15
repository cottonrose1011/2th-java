package zoo;

import java.util.ArrayList;

public class Zoo {
	public void go() {
		ArrayList<Animal> arrayList = new ArrayList<>();
		// --> 다형성, if 동물 100마리 였을 때 !
		
		arrayList.add(new Lion());
		arrayList.add(new Cat());
		arrayList.add(new Lion());
		
		for(Animal animal : arrayList) {
			animal.makeSound();
		}
	}
}
