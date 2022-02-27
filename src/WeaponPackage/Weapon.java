package WeaponPackage;

public abstract class Weapon {
    private int damage;
    private int range;

    public Weapon() {
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String toString() {
        return "Damage: " + damage + " Range: " + range;
    }

    public boolean checkIfInRange(int distance){
        return distance <= range;

    }
}
