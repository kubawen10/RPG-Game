package CharacterPackage;

import ArmorPackage.HeavyArmor;
import WeaponPackage.SwordWeapon;

public class Knight extends Character{
    public Knight(String name){
        super(name);
        this.setMapDescription("KN");
        this.setHealth(200);
        this.setWeaponBehavior(new SwordWeapon());
        this.setArmorBehavior(new HeavyArmor());
    }

    public String toString() {
        return "KNIGHT\t\t" + super.toString();
    }
}
