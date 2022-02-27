package WeaponPackage;

import CharacterPackage.Character;

import java.util.Random;

public class ForkWeapon extends Weapon implements WeaponBehavior {
    public ForkWeapon() {
        setDamage(10);
        setRange(2); //you can throw them!
    }

    @Override
    public void attack(Character other) {
        //10% chance the they strike critically
        Random r = new Random();
        int criticalStrike = r.nextInt(100);
        if (criticalStrike < 10) {
            this.setDamage(50);
        } else {
            this.setDamage(10);
        }

        other.performDefense(this);
    }

    @Override
    public void showOff() {
        System.out.println("2 in 1 tool");
    }

    @Override
    public String toString() {
        return "Fork - " + super.toString();

    }
}
