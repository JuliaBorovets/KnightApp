package main.java.model.enums;

public enum ArmorType {
    CHAIN_MAIL("armor.type1"),
    PLATE_ARMOR("armor.type2");

    private String value;

    ArmorType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
