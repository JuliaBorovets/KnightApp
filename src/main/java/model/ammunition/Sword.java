package main.java.model.ammunition;

public class Sword extends Ammunition {

    private final boolean twoHanded;
    private int resistance;

    public Sword(String name, double weight, double cost, String size, boolean twoHanded, int resistance) {
        super(name, weight, cost, size);
        this.twoHanded = twoHanded;
        this.resistance = resistance;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public int getResistance() {
        return resistance;
    }
}
