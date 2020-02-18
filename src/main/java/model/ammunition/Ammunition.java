package main.java.model.ammunition;

public abstract class Ammunition {

    public String name;
    public double weight;
    public double cost;

    public Ammunition(String name, double weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return " weight=" + weight +
                ", cost=" + cost;
    }

}
