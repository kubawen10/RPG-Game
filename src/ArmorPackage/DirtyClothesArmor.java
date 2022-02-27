package ArmorPackage;

import WeaponPackage.Weapon;

public class DirtyClothesArmor extends Armor implements ArmorBehavior {
    public DirtyClothesArmor() {
        setReduction(5);
    }

    public int defense(Weapon weapon) {
        //worst armor
        return calculateDamage(weapon.getDamage());
    }

    public String toString() {
        return "Dirty Clothes - " + super.toString();
    }
}