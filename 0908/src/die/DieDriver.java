package die;

public class DieDriver {

	public static void main(String[] args) {
		Die die = new Die();
		Die die2 = new Die(3,2);
		
		die.sum();
		System.out.println("------두 주사위의 눈 변경------");
		die2.sum();

	}

}
