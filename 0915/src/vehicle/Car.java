package vehicle;

public class Car extends Vehicle{
	public Car(String time) {
		this.time = time;
	}
	
	public Car() {
		this("5시간 20분");
	}

}
