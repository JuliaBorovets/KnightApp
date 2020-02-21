package main.java.model.ammunition;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public class Armor extends Ammunition {

    private String type;
    private int resistance;

    public Armor(String name, double weight, double cost, String size, String type, int resistance) {
        super(name, weight, cost, size);
        this.type = type;
        this.resistance = resistance;
    }

    public String getType() {
        return type;
    }

    public int getResistance() {
        return resistance;
    }
}
