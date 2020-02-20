package main.java.model.ammunition;

public class Armor extends Ammunition {

    private String type;
    private String size;
    private int resistance;

    public Armor(String name, double weight, double cost, String type, String size, int resistance) {
        super(name, weight, cost);
        this.type = type;
        this.size = size;
        this.resistance = resistance;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getResistance() {
        return resistance;
    }
}
