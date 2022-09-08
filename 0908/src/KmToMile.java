
public class KmToMile {
	private double km = 4;

	
	//methods
	public KmToMile(double km) {
		super();
		this.km = km;
	}
	public KmToMile() {
		super();
	}
	public void toMile() {
		double mile;
		mile = km*0.62137;
		System.out.println(km+" km = "+mile+" mile \n");
	}
	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		if(km < 0) {
			this.km = 0;
			System.out.println("음수일 수 없음.");
			return;
		}
		else this.km = km;
	}
	
}
