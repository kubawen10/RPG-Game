package CharacterPackage;

import ArmorPackage.KingsRobeArmor;
import WeaponPackage.SwordWeapon;

public class King extends Character {
    public King(String name) {
        super(name);
        this.setMapDescription("KI");
        this.setHealth(150);
        setWeaponBehavior(new SwordWeapon());
        setArmorBehavior(new KingsRobeArmor());
    }

    public String toString() {
        return "KING\t\t" + super.toString();
    }

}
