package ArmorPackage;

import WeaponPackage.Weapon;

import java.util.Random;

public class DressArmor extends Armor implements ArmorBehavior{
    public DressArmor(){
        setReduction(0);
    }

    public int defense(Weapon weapon) {
        int damageDealt;

        //dress can cause characters to fall in love and deal 0 dmg
        Random r = new Random();
        boolean fallInLove = r.nextBoolean();

        if(fallInLove){
            damageDealt = 0;
            return damageDealt;
        }
        damageDealt = calculateDamage(weapon.getDamage());

        return damageDealt;
    }

    public String toString(){
        return "Dress - " + super.toString();
    }
}
