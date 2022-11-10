package coffee;

public class Milk extends Coffee{
	Coffee coffee;
	
	public Milk(Coffee coffee) {
		this.coffee = coffee;
		this.description = this.coffee.description + ", Milk 추가";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost()+300.0;
	}
}
