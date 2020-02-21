package main.java.model;

import main.java.controller.AmmunitionEnum;
import main.java.controller.RegexContainer;
import main.java.model.ammunition.Ammunition;
import java.util.*;

public class Model implements Shop {

    @Override
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

    @Override
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


    @Override
    public double calculateTotalPrice(ArrayList<Ammunition> ammunition) {
        double result = 0.0;
        for (Ammunition a : ammunition) {
            result += a.getCost();
        }
        return result;
    }

    @Override
    public ArrayList<Ammunition> getFromDiapason(ArrayList<Ammunition> ammunition, double min, double max) {
        ArrayList<Ammunition> result = new ArrayList<>();
        for (Ammunition a : ammunition) {
            if (a.getCost() >= 0 && a.getCost() >= min && a.getCost() <= max) {
                result.add(a);
            }
        }
        return result;
    }

    @Override
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
