package main.java.model;

import main.java.model.ammunition.Ammunition;
import main.java.model.ammunition.Armor;
import main.java.model.enums.AmmunitionSize;
import main.java.model.enums.ArmorType;

import java.util.ArrayList;

public class Model {

    //    private Ammunition ammunition = new Armor("nnn", 12 ,14, ArmorType.CHAIN_MAIL,
//            AmmunitionSize.SIZE_S,23);
    private ArrayList<Ammunition> allAmmunition = new ArrayList<>();
    private ArrayList<Ammunition> selectedAmmunition = new ArrayList<>();

    public void addNewAmmunition(Ammunition amm) {
        selectedAmmunition.add(amm);
    }


    public ArrayList<Ammunition> getAllAmmunition() {

        return allAmmunition;
    }

    public void setAllAmmunition(ArrayList<Ammunition> allAmmunition) {
        this.allAmmunition = allAmmunition;
    }

    public ArrayList<Ammunition> getSelectedAmmunition() {
        return selectedAmmunition;
    }

    public void setSelectedAmmunition(ArrayList<Ammunition> selectedAmmunition) {
        this.selectedAmmunition = selectedAmmunition;
    }
}
