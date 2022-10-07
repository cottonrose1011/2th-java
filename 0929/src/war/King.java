package war;

public class King extends Character{
	
	public King() {
		super(new AxeStyle());
	}
	
	public King(WeaponStyle weaponStyle) {
		super(weaponStyle);
	}
}
