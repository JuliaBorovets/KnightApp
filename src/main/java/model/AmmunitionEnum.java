package main.java.model;

public enum AmmunitionEnum {
    //head
    MAIL_COIF (34.6, 234),
    NASAL_HELMET (12, 221);

    private final double weight;   // в килограммах
    private final double price; // в метрах
    private AmmunitionEnum(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }
    public double getWeight() { return weight; }
    public double getPrice() { return price; }

}
