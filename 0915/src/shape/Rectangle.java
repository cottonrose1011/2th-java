package shape;

public class Rectangle extends Shape{
	protected double width;
	protected double height;
	
	public Rectangle() {
		this(0.0, 0.0);
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void area() {
		double area;
		area = width*height;
		System.out.println(area);
	}	
}
