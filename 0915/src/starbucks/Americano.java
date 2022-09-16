package starbucks;

public class Americano extends Starbucks{
	public Americano(int price) {
		this.price = price;
	}
	public Americano() {
		this(4500);
	}
}

