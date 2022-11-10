package coffee;

public class Soy extends Coffee{
	Coffee coffee;
	
	public Soy(Coffee coffee) {
		this.coffee = coffee;
		this.description = this.coffee.description + ", Soy 추가";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 400.0;
	}

}
