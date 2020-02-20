package main.java.controller;

import main.java.model.ammunition.Armor;
import main.java.model.ammunition.Helmet;
import main.java.model.ammunition.Shield;
import main.java.model.ammunition.Sword;
import main.java.view.TextConstant;

import static main.java.view.TextConstant.*;

public enum AmmunitionEnum {

    ARMOR1(new Armor(TextConstant.ARMOR1, 23, 12, ARMOR_TYPE_1, SIZE_S, 32) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TYPE + getType() + ", " +
                    SIZE + getSize() + ", " + RESISTANCE + getResistance();
        }
    }
    ),
    HELMET1(new Helmet(TextConstant.HELMET1, 45, 23, true, 2, SIZE_L) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + IS_CLOSED +
                    isCloseHelmet() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    SHIELD1(new Shield(TextConstant.SHIELD1, 28, 3, 1, SIZE_S) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + RESISTANCE +
                    getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    SWORD1(new Sword(TextConstant.SWORD1, 2, 3, true, 24) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TWO_HANDED +
                    isTwoHanded() + ", " + RESISTANCE + getResistance();
        }
    }
    );

    Armor armor;
    Helmet helmet;
    Shield shield;
    Sword sword;

    AmmunitionEnum(Armor armor) {
        this.armor = armor;
    }

    AmmunitionEnum(Helmet helmet) {
        this.helmet = helmet;
    }

    AmmunitionEnum(Shield shield) {
        this.shield = shield;
    }

    AmmunitionEnum(Sword sword) {
        this.sword = sword;
    }

    public Armor getArmor() {
        return armor;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public Shield getShield() {
        return shield;
    }

    public Sword getSword() {
        return sword;
    }

}
