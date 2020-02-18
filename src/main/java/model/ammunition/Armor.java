package main.java.model.ammunition;

import main.java.model.enums.AmmunitionSize;
import main.java.model.enums.ArmorType;

public class Armor extends Ammunition {

    private ArmorType type; //There were two main kinds of armor: chain mail and plate armor.
    private AmmunitionSize size;
    private int resistance; //опір

    public Armor(String name, double weight, double cost, ArmorType type, AmmunitionSize size, int canTakeDamage) {
        super(name, weight, cost);
        this.type = type;
        this.size = size;
        this.resistance = canTakeDamage;
    }

    public int getResistance() {
        return resistance;
    }

    public ArmorType getType() {
        return type;
    }

    public int getCanTakeDamage() {
        return resistance;
    }

    public void setCanTakeDamage(int canTakeDamage) {
        this.resistance = canTakeDamage;
    }

    public AmmunitionSize getSize() {
        return size;
    }


    @Override
    public String toString() {
        return "Armor " + getName() + super.toString() +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", canTakeDamage=" + resistance;
    }
}
