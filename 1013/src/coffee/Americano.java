package coffee;

public class Americano extends Coffee{
	
	public Americano() {
		this.description = "Americano";
	}

	@Override
	public double cost() {	
		return 2000.0;
	}
}
