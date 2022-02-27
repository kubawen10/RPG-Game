package ArmorPackage;

public abstract class Armor {
    private int reduction;

    public Armor() {
    }

    //damage reduction based on League Of Legends
    protected int calculateDamage(int weaponDamage){
        return (int)(weaponDamage * (100.0 / (100 + getReduction())));
    }

    public int getReduction() {
        return reduction;
    }

    public void setReduction(int reduction) {
        this.reduction = reduction;
    }

    public String toString() {
        return "Damage reduction: " + reduction;
    }
}
