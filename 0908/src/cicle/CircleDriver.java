package cicle;

public class CircleDriver {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.area();
		System.out.println("-----------반지름 변경----------");
		circle.setRadius(3);
		circle.area();
	}

}
