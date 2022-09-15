package shape;

public class Circle extends Shape{
	
	private double radius; //상위클래스가 아니니 private으로 한다.
	
	public Circle() {
		this(0.0);
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		double area;
		area = radius*radius*3.14;
		System.out.println(area);
	}
}
