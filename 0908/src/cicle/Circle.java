package cicle;

public class Circle {
	private double radius = 5;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
	}
	public void area() {
		double area = radius*radius*3.14;
		System.out.println("원의 면적: "+area);
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius<=0) {
			this.radius = 1;
			System.out.println("0 이하일 수 없음.");
			return;
		}
		else this.radius = radius;
	}
}
