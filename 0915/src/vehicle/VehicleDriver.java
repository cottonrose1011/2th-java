package vehicle;

import java.util.ArrayList;

public class VehicleDriver {

	public static void main(String[] args) {
		ArrayList<Vehicle> arrayList = new ArrayList<>();
		
		arrayList.add(new Car());
		arrayList.add(new Ktx());
		
		for(Vehicle vehicle : arrayList) {
			vehicle.TimeRequired_BusanToSeoul();
		}

	}

}
