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

    private int cost;

    private String size;

    public Ammunition(String name, double weight, int cost, String size) {
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

    public int getCost() {
        return cost;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name + ": " + "weight=" + weight + ", cost=" + cost + ", size=" + size + ", ";
    }
}
