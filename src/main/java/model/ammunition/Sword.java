package main.java.model.ammunition;

public class Sword extends Ammunition {

    private final boolean twoHanded;
    private int damage;

    public Sword(String name, double weight, double cost, boolean twoHanded, int damage) {
        super(name, weight, cost);
        this.twoHanded = twoHanded;
        this.damage = damage;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Sword " + getName() + super.toString() +
                ", twoHanded=" + twoHanded +
                ", damage=" + damage;
    }
}
