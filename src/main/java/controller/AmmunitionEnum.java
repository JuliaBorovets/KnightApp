package main.java.controller;

import main.java.model.ammunition.Armor;
import main.java.model.ammunition.Helmet;
import main.java.model.ammunition.Shield;
import main.java.model.ammunition.Sword;
import main.java.view.TextConstant;

import static main.java.view.TextConstant.*;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public enum AmmunitionEnum {

    ARMOR1(new Armor(TextConstant.ARMOR1, 23, 12, ARMOR_TYPE_1, SIZE_S, 32) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TYPE + getType()
                    + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    ARMOR2(new Armor(TextConstant.ARMOR2, 73, 121, ARMOR_TYPE_2, SIZE_M, 32) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TYPE + getType()
                    + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    ARMOR3(new Armor(TextConstant.ARMOR3, 63, 111, ARMOR_TYPE_2, SIZE_L, 32) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TYPE + getType()
                    + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    HELMET1(new Helmet(TextConstant.HELMET1, 45, 23, SIZE_S, true, 2) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + IS_CLOSED +
                    isCloseHelmet() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    HELMET2(new Helmet(TextConstant.HELMET2, 81, 310, SIZE_M, false, 6) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + IS_CLOSED +
                    isCloseHelmet() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    HELMET3(new Helmet(TextConstant.HELMET3, 81, 310, SIZE_L, false, 9) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + IS_CLOSED +
                    isCloseHelmet() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    SHIELD1(new Shield(TextConstant.SHIELD1, 28, 3, SIZE_S, 1) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + RESISTANCE +
                    getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    SHIELD2(new Shield(TextConstant.SHIELD2, 52, 271, SIZE_M, 6) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + RESISTANCE +
                    getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    SHIELD3(new Shield(TextConstant.SHIELD3, 62, 271, SIZE_L, 1) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + RESISTANCE +
                    getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    SWORD1(new Sword(TextConstant.SWORD1, 2, 3, SIZE_S, true, 24) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TWO_HANDED +
                    isTwoHanded() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),

    SWORD2(new Sword(TextConstant.SWORD2, 1, 87, SIZE_M, true, 2) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TWO_HANDED +
                    isTwoHanded() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
        }
    }
    ),
    SWORD3(new Sword(TextConstant.SWORD3, 7, 87, SIZE_L, false, 67) {
        @Override
        public String toString() {
            return getName() + " : " + WEIGHT + getWeight() + ", " + PRICE + getCost() + ", " + TWO_HANDED +
                    isTwoHanded() + ", " + RESISTANCE + getResistance() + ", " + SIZE + getSize();
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
