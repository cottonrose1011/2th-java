package triangle;

public class TriangleDriver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		triangle.area();
		System.out.println("-----------width, height 변경--------------");
		triangle.setHeight(5);
		triangle.setWidth(6);
		triangle.area();
		
	}

}
