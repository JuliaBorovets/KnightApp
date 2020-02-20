package main.java.model.ammunition;

public class Helmet extends Ammunition {

    private final boolean isCloseHelmet;
    private int resistance;
    private String size;

    public Helmet(String name, double weight, double cost, boolean isCloseHelmet, int resistance, String size) {
        super(name, weight, cost);
        this.isCloseHelmet = isCloseHelmet;
        this.resistance = resistance;
        this.size = size;
    }

    public int getResistance() {
        return resistance;
    }

    public boolean isCloseHelmet() {
        return isCloseHelmet;
    }

    public String getSize() {
        return size;
    }

}
