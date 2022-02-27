package CharacterPackage;

import ArmorPackage.DragonSkinArmor;
import WeaponPackage.FlameWeapon;

public class Dragon extends Character{
    public Dragon(String name){
        super(name);
        this.setMapDescription("DR");
        this.setHealth(300);
        this.setWeaponBehavior(new FlameWeapon());
        this.setArmorBehavior(new DragonSkinArmor());
    }

    public String toString() {
        return "DRAGON\t\t" + super.toString();
    }
}
