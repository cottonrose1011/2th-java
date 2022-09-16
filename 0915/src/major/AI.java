package major;

public class AI extends ComputerScience{
	protected String major = "";
	
	public AI(String undergraduate, String major) {
		super(undergraduate);
		this.major = major;
	}
	
	public AI() {
		this("Computerscience","AI");
	}
	
	@Override
	public void printMajor() {
		System.out.println(undergraduate+", "+major);
	}

}
