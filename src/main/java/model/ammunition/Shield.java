package main.java.model.ammunition;

public class Shield extends Ammunition {
    private int canTakeDamage;
    private String size;

    public Shield(String name, double weight, double cost, int canTakeDamage, String size) {
        super(name, weight, cost);
        this.canTakeDamage = canTakeDamage;
        this.size = size;
    }

    public int getCanTakeDamage() {
        return canTakeDamage;
    }

    public String getSize() {
        return size;
    }

    public void setCanTakeDamage(int canTakeDamage) {
        this.canTakeDamage = canTakeDamage;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shield " + super.toString() +
                ", canTakeDamage=" + canTakeDamage +
                ", size='" + size;
    }
}
