package main.java.model.ammunition;

public class Shield extends Ammunition {
    private int resistance;

    public Shield(String name, double weight, double cost, String size, int resistance) {
        super(name, weight, cost, size);
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

}
