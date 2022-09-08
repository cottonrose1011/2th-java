
public class Profile {
	private int grade = 2;
	private String name = "정부용", univ = "경성대학교", major = "소프트웨어";
	
	
	//methods
	public Profile(String name, String univ, String major, int grade ) {
		super();
		this.name = name;
		this.univ = univ;
		this.major = major;
		this.grade = grade;
	}
	public Profile() {
		super();
	}
	
	public void show() {
		System.out.printf("이름: %s \n학교: %s \n학년: %d \n학과: %s\n", name, univ, grade, major);
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
