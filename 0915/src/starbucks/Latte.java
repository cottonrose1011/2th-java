package starbucks;

public class Latte extends Starbucks{
	public Latte(int price) {
		this.price = price;
	}
	public Latte() {
		this(5000);
	}

}
