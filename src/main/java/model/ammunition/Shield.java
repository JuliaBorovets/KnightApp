package main.java.model.ammunition;

public class Shield extends Ammunition {
    private int resistance;
    private String size;

    public Shield(String name, double weight, double cost, int resistance, String size) {
        super(name, weight, cost);
        this.resistance = resistance;
        this.size = size;
    }

    public int getResistance() {
        return resistance;
    }

    public String getSize() {
        return size;
    }
}
