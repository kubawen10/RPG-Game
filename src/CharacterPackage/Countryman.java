package CharacterPackage;

import ArmorPackage.DirtyClothesArmor;
import WeaponPackage.ForkWeapon;

public class Countryman extends Character{
    public Countryman(String name){
        super(name);
        this.setMapDescription("CM");
        this.setHealth(90);
        this.setWeaponBehavior(new ForkWeapon());
        this.setArmorBehavior(new DirtyClothesArmor());
    }

    public String toString() {
        return "COUNTRYMAN\t\t" + super.toString();
    }
}
