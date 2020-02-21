package main.java.model;

import main.java.controller.AmmunitionEnum;
import main.java.controller.RegexContainer;
import main.java.model.ammunition.Ammunition;

import java.util.ArrayList;

/**
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public class Model {

    /**
     * Makes an ArrayList of Ammunition from Enum values
     *
     * @return ArrayList of Ammunition
     */

    public ArrayList<Ammunition> getAmmunition() {
        ArrayList<Ammunition> amm = new ArrayList<>();
        for (AmmunitionEnum el : AmmunitionEnum.values()) {
            if (el.name().matches(RegexContainer.REGEX_HELMET)) {
                amm.add(el.getHelmet());
            } else if (el.name().matches(RegexContainer.REGEX_SWORD)) {
                amm.add(el.getSword());
            } else if (el.name().matches(RegexContainer.REGEX_SHIELD)) {
                amm.add(el.getShield());
            } else {
                amm.add(el.getArmor());
            }
        }
        return amm;
    }

    /**
     * Sort ArrayList of Ammunition  by "Bubble" method
     *
     * @param ammunition - list if ammunition
     * @return sorted ammunition
     */
    public ArrayList<Ammunition> sort(ArrayList<Ammunition> ammunition) {
        Ammunition temp;
        boolean hasSwapped;

        do {
            hasSwapped = false;
            for (int i = 1; i < ammunition.size(); i++) {
                if (ammunition.get(i - 1).getWeight() < ammunition.get(i).getWeight()) {
                    temp = ammunition.get(i - 1);
                    ammunition.set(i - 1, ammunition.get(i));
                    ammunition.set(i, temp);
                    hasSwapped = true;
                }
            }
        } while (hasSwapped);

        return ammunition;
    }


    /**
     * Adds all the value of the ammunition
     *
     * @param ammunition - ArrayList of ammunition
     * @return total cost
     */
    public double calculateTotalPrice(ArrayList<Ammunition> ammunition) {
        double result = 0.0;
        for (Ammunition a : ammunition) {
            result += a.getCost();
        }
        return result;
    }


    /**
     * Method to get ammunition from a given range
     *
     * @param ammunition - list of ammunition
     * @param min        - minimum value
     * @param max        - maximum value
     * @return ammunition from a given range
     */
    public ArrayList<Ammunition> getFromRange(ArrayList<Ammunition> ammunition, double min, double max) {
        ArrayList<Ammunition> result = new ArrayList<>();
        for (Ammunition a : ammunition) {
            if (a.getCost() >= 0 && a.getCost() >= min && a.getCost() <= max) {
                result.add(a);
            }
        }
        return result;
    }


    /**
     * Method to filter ammunition by size
     *
     * @param ammunition - list of ammunition
     * @param size       - the value by which to filter the ammunition
     * @return filtered ammunition
     */
    public ArrayList<Ammunition> chooseSize(ArrayList<Ammunition> ammunition, String size) {
        ArrayList<Ammunition> result = new ArrayList<>();
        for (Ammunition a : ammunition) {
            if (a.getSize().equals(size)) {
                result.add(a);
            }
        }
        return result;
    }
}
