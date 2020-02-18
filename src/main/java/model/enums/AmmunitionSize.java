package main.java.model.enums;

public enum AmmunitionSize {
    SIZE_XS("ammunition.size.xs"),
    SIZE_S("ammunition.size.s"),
    SIZE_M("ammunition.size.m"),
    SIZE_L("ammunition.size.l"),
    SIZE_XL("ammunition.size.xl");

    private String value;

    AmmunitionSize(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
