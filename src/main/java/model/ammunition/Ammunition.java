package main.java.model.ammunition;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
