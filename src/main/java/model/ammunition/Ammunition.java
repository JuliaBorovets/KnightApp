package main.java.model.ammunition;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public abstract class Ammunition {

    private String name;

    private double weight;

    private double cost;

    private String size;

    public Ammunition(String name, double weight, double cost, String size) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String getSize() {
        return size;
    }

}
