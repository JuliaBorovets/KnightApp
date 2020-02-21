package main.java.model.ammunition;

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
