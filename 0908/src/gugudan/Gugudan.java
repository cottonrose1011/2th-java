package gugudan;

public class Gugudan {
	//field
	private int dan = 3;
	private String name = "";
	
	//methods
	public Gugudan(int dan, String name) { //파라미터 값을 받으면 넣은 파라미터가 새로 적용됨. (Driver 안에)
		super();
		this.dan = dan;
		this.name = name;
	}
	public Gugudan() { //생성자 파라미터 값 없을 때, 그러면 초기에 세팅된 필드 값들이 적용된다.
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void go() {
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+" x "+i+" = "+dan*i);
		}
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

}
