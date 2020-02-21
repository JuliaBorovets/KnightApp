package main.java.model.ammunition;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public class Sword extends Ammunition {

    /*Shows whether it can be used on both hands*/
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
