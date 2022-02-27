package ArmorPackage;

import WeaponPackage.Weapon;

import java.util.Random;

public class KingsRobeArmor extends Armor implements ArmorBehavior{
    public KingsRobeArmor(){
        setReduction(20);
    }

    public int defense(Weapon weapon) {
        int damageDealt;

        damageDealt = calculateDamage(weapon.getDamage());

        //King's robe can cause characters to like/dislike king and deal less/more dmg
        Random r = new Random();
        boolean likesKing = r.nextBoolean();

        if(likesKing){
            damageDealt = (int)(damageDealt * 0.5);
        }
        else{
            damageDealt = (int)(damageDealt*1.5);
        }

        return damageDealt;
    }

    public String toString(){
        return "King's Robe - " + super.toString();
    }
}