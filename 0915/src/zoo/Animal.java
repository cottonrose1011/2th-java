package zoo;

public class Animal {
	protected String sound=""; //상위 클래스의 변수는 private를 쓰면 안된다.

	//methods
	public void makeSound() {
		System.out.println(sound);
	}
	public Animal() {
		super();
	}
}
