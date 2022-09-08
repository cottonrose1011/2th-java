package rectangle;

public class RectangleDriver {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		System.out.println("---------가로, 세로 변경------");
		rectangle.setHeight(4);
		rectangle.setWidth(3);
		rectangle.area();

	}

}
