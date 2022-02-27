package ArmorPackage;

import WeaponPackage.Weapon;

public class LightArmor extends Armor implements ArmorBehavior {
    public LightArmor(){
        setReduction(15);
    }

    public int defense(Weapon weapon) {
        int damageDealt;

        damageDealt = calculateDamage(weapon.getDamage());

        //this one reduces dmg dealt by 5 (can heal)
        damageDealt-=5;

        return damageDealt;
    }

    public String toString(){
        return "Light Armor - " + super.toString();
    }
}
