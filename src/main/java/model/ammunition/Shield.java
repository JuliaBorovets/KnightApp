package main.java.model.ammunition;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public class Shield extends Ammunition {
    private int resistance;

    public Shield(String name, double weight, int cost, String size, int resistance) {
        super(name, weight, cost, size);
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return getName() + ": " + "weight=" + getWeight() + ", cost=" + getCost() + ", size=" + getSize() + ", " +
                "resistance=" + resistance;
    }

    public int getResistance() {
        return resistance;
    }

}
