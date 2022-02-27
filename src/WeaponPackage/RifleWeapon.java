package WeaponPackage;

import CharacterPackage.Character;

public class RifleWeapon extends Weapon implements WeaponBehavior {
    public RifleWeapon() {
        setDamage(20);
        setRange(4);
    }

    @Override
    public void attack(Character other) {
        //not too powerful but has biggest range
        other.performDefense(this);
    }

    @Override
    public void showOff() {
        System.out.println("Skrrra Ratttatatatta");
    }

    @Override
    public String toString() {
        return "Rifle - " + super.toString();
    }
}
