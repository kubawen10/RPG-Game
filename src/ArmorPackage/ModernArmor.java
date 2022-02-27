package ArmorPackage;

import WeaponPackage.Weapon;

public class ModernArmor extends Armor implements ArmorBehavior {
    public ModernArmor(){
        setReduction(40);
    }

    public int defense(Weapon weapon) {
        //this one has the best reduction but doesnt do anything
        return calculateDamage(weapon.getDamage());
    }

    public String toString(){
        return "Modern Armor - " + super.toString();
    }
}
