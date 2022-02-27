package ArmorPackage;

import WeaponPackage.Weapon;

public class HeavyArmor extends Armor implements ArmorBehavior{
    public HeavyArmor(){
        setReduction(30);
    }

    public int defense(Weapon weapon) {
        int damageDealt;

        damageDealt = calculateDamage(weapon.getDamage());

        //this one is good for distant attacks
        if (weapon.getRange()>1){
            damageDealt = (int)(0.75 * damageDealt);
        }

        return damageDealt;
    }

    public String toString(){
        return "Heavy Armor - " + super.toString();
    }
}
