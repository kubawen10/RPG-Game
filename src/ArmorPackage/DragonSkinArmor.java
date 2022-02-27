package ArmorPackage;

import WeaponPackage.Weapon;

public class DragonSkinArmor extends Armor implements ArmorBehavior {
    public DragonSkinArmor() {
        setReduction(30);
    }

    public int defense(Weapon weapon) {
        int damageDealt;
        int weaponDamage = weapon.getDamage();

        damageDealt = calculateDamage(weaponDamage);

        //damage reduction for melee weapon,
        if (weapon.getRange() == 1) {
            weapon.setDamage(weaponDamage - 1);
        }

        return damageDealt;
    }

    public String toString(){
        return "Dragon Skin - " + super.toString();
    }
}
