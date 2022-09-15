package shape;

import java.util.ArrayList;

public class ShapeDriver {

	public static void main(String[] args) {
		
		ArrayList<Shape> arrayList = new ArrayList<>();
		
		arrayList.add(new Circle(10.0));
		arrayList.add(new Rectangle(10, 10));
		arrayList.add(new Triangle(10, 10));
		
		for(Shape shape : arrayList) {
			shape.area();
		}
	}
}
