package CharacterPackage;

import ArmorPackage.ModernArmor;
import WeaponPackage.RifleWeapon;

public class Marine extends Character{
    public Marine(String name){
        super(name);
        this.setMapDescription("MA");
        this.setHealth(170);
        this.setWeaponBehavior(new RifleWeapon());
        this.setArmorBehavior(new ModernArmor());
    }

    public String toString() {
        return "MARINE\t\t" + super.toString();
    }
}
