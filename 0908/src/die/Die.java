package die;

public class Die {
	private int spot1 = 6;
	private int spot2 = 3;
	
	//methods
	public Die(int spot1, int spot2) {
		super();
		this.spot1 = spot1;
		this.spot2 = spot2;
	}
	public Die() {
		super();
	}
	
	public void sum() {
		int sum = spot1 + spot2;
		if(sum < 2 || sum > 12) System.out.println("두 눈의 합으로 나올 수 없음.");
		else System.out.println("두 눈의 합: "+sum);
	}
	
	
	public int getSpot1() {
		return spot1;
	}
	public void setSpot1(int spot1) {
		this.spot1 = spot1;
	}
	public int getSpot2() {
		return spot2;
	}
	public void setSpot2(int spot2) {
		this.spot2 = spot2;
	}
	

}
