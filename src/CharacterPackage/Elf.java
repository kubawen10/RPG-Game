package CharacterPackage;

import ArmorPackage.LightArmor;
import WeaponPackage.BowWeapon;

public class Elf extends Character{
    public Elf(String name){
        super(name);
        this.setMapDescription("EL");
        this.setHealth(130);
        this.setWeaponBehavior(new BowWeapon());
        this.setArmorBehavior(new LightArmor());
    }

    public String toString() {
        return "ELF\t\t" + super.toString();
    }
}
