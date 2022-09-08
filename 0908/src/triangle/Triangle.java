package triangle;


public class Triangle {
	private double width=4;
	private double height=6;
	//methods
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Triangle() {
		super();
	}
	
	public void area() {
		double t_area = width*height/2;
		if(t_area <= 0) {
			System.out.println("0 이하일 수 없음.");
		}
		else System.out.println("삼각형의 면적: "+t_area);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}
