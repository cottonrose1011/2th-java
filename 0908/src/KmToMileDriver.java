
public class KmToMileDriver {

	public static void main(String[] args) {
		KmToMile kmToMile = new KmToMile();
		kmToMile.toMile();
		System.out.println("----------------km 값 변환-------------\n");
		kmToMile.setKm(9);
		kmToMile.toMile();

	}

}
