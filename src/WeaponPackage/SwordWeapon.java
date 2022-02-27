package WeaponPackage;

import CharacterPackage.Character;

public class SwordWeapon extends Weapon implements WeaponBehavior {
    public SwordWeapon() {
        setDamage(25);
        setRange(1);
    }

    @Override
    public void attack(Character other) {
        other.performDefense(this);
    }

    @Override
    public void showOff() {
        System.out.println("Woah that's a long one!");
    }

    @Override
    public String toString() {
        return "Sword - " + super.toString();

    }
}
