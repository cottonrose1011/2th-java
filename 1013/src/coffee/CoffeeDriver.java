package coffee;

public class CoffeeDriver {

	public static void main(String[] args) {
	
		Coffee coffee = new Americano();
		coffee = new Milk(coffee);
		coffee = new Soy(coffee);
		coffee = new Milk(coffee);
		
		System.out.println(coffee.getDescription() +": "+ coffee.cost()+"원");
	}
}
