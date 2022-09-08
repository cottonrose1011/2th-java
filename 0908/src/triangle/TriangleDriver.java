package triangle;

public class TriangleDriver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Triangle triangle2 = new Triangle(3, 6);
		
		triangle.area();
		System.out.println("-----------width, height 변경--------------");
		triangle2.area();
		

	}

}
