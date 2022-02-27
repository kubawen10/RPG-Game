package WeaponPackage;

import CharacterPackage.Character;

import java.util.Random;

public class FlameWeapon extends Weapon implements WeaponBehavior {
    public FlameWeapon() {
        setDamage(40);
        setRange(2);
    }

    @Override
    public void attack(Character other) {
        //25% chance the weapon is overheated
        Random r = new Random();
        int overheated = r.nextInt(100);
        if (overheated > 25) {
            other.performDefense(this);
        }
    }

    @Override
    public void showOff() {
        System.out.println("Could you heat up by bacon please?");
    }

    @Override
    public String toString() {
        return "Flame - " + super.toString();

    }
}
