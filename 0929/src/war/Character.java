package war;

public class Character {
	WeaponStyle weaponStyle;
	
	public Character(WeaponStyle weaponStyle) {
		this.weaponStyle = weaponStyle;
	}
	
	public void fight() {
		weaponStyle.fight();
	}
}
