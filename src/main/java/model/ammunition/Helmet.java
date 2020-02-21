package main.java.model.ammunition;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */


public class Helmet extends Ammunition {

    private final boolean isCloseHelmet;
    private int resistance;

    public Helmet(String name, double weight, double cost, String size, boolean isCloseHelmet, int resistance) {
        super(name, weight, cost, size);
        this.isCloseHelmet = isCloseHelmet;
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    public boolean isCloseHelmet() {
        return isCloseHelmet;
    }


}
