package shape;

public class Triangle extends Rectangle{
	@Override
	public void area() {
		double area;
		area = width*height/2;
		System.out.println(area);
	}
	public Triangle(double width, double height) {
		super(width, height); //상위에 있는 Rectangle의 생성자 형식을 따라하겠다.
	}
	public Triangle() {
		super(); // 마찬가지!
	}
}
