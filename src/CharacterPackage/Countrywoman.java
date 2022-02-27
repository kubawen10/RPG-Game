package CharacterPackage;

import ArmorPackage.DressArmor;
import WeaponPackage.RollingPinWeapon;

public class Countrywoman extends Character{
    public Countrywoman(String name) {
        super(name);
        this.setMapDescription("CW");
        this.setHealth(60);
        setWeaponBehavior(new RollingPinWeapon());
        setArmorBehavior(new DressArmor());
    }

    public String toString() {
        return "COUNTRYWOMAN\t\t" + super.toString();
    }
}
