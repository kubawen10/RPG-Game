package WeaponPackage;

import CharacterPackage.Character;

public class BowWeapon extends Weapon implements WeaponBehavior {
    public BowWeapon() {
        setDamage(10);
        setRange(2);
    }

    @Override
    public void attack(Character other) {
        other.performDefense(this);
        //every attack character gains experience and can shoot further
        this.setRange(this.getRange() + 1);

    }

    @Override
    public void showOff() {
        System.out.println("*shots a flying apple*");
    }

    @Override
    public String toString() {
        return "Bow - " + super.toString();

    }

}
