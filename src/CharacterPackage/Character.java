package CharacterPackage;

import ArmorPackage.ArmorBehavior;
import Map.Map;
import WeaponPackage.Weapon;
import WeaponPackage.WeaponBehavior;

abstract public class Character {

    private WeaponBehavior weaponBehavior;

    private ArmorBehavior armorBehavior;

    private int health;
    private final String name;
    private String mapDescription;

    public Character(String name) {
        this.name = name;
    }

    public void performAttack(Character other, int distance) {
        if ( weaponBehavior.checkIfInRange(distance)) {
            weaponBehavior.attack(other);
        } else System.out.println("Out of range");
    }

    public void performShowOff() {
        weaponBehavior.showOff();
    }

    public void performDefense(Weapon weapon) {
        health = health - armorBehavior.defense(weapon);
    }

    public void move(Map m, int direction) {
        m.moveCharacter(this, direction);
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }

    public void setArmorBehavior(ArmorBehavior ab) {
        armorBehavior = ab;
    }

    public String getName() {
        return name;
    }

    public String getMapDescription() {
        return mapDescription;
    }

    public void setMapDescription(String mapDescription) {
        this.mapDescription = mapDescription;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String toString() {
        return "Name: " + name + ",\t Health: " + health + "\t\t" + weaponBehavior + "\t\t" + armorBehavior;
    }
}
