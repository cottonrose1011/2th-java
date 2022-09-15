package flower;

public class Flower {
	protected String color="";
	
	public Flower() { //superClass에 생성자가 없으면 안되는 이유?
		super();
	}
	public void printColor() {
		System.out.println(color);
	}
	
	
	
}
