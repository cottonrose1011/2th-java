package rectangle;

public class Rectangle {
	private double width=3;
	private double height=10;

	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		super();
	}
	public void area() {
		double area = width*height;
		System.out.println("사각형의 면적: "+area);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width <=0) {
			this.width = 1;
			System.out.println("0 이하일 수 없음.");
			return;
		}
		else this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height <=0) {
			this.height = 1;
			System.out.println("0 이하일 수 없음.");
			return;
		}
		else this.height = height;
	}
	

}
