package WeaponPackage;

import CharacterPackage.Character;

public class RollingPinWeapon extends Weapon implements WeaponBehavior {
    public RollingPinWeapon() {
        setDamage(5);
        setRange(1);
    }

    @Override
    public void attack(Character other) {
        //its not the greatest weapon
        other.performDefense(this);
    }

    @Override
    public void showOff() {
        System.out.println("What would you like to eat today?");
    }

    @Override
    public String toString() {
        return "Rolling pin - " + super.toString();

    }

}
