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

    public boolean isCloseHelmet() {
        return isCloseHelmet;
    }

    public int getCanTakeDamage() {
        return resistance;
    }

    public String getSize() {
        return size;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helmet " + super.toString() +
                ", isCloseHelmet=" + isCloseHelmet +
                ", canTakeDamage=" + resistance +
                ", size='" + size;
    }
}
