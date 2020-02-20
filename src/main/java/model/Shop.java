package main.java.model;

import main.java.model.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.List;

public interface Shop {

    ArrayList<Ammunition> getAmmunition();

    ArrayList<Ammunition> sort(ArrayList<Ammunition> ammunition);

    double calculateTotalPrice(ArrayList<Ammunition> ammunition);

    ArrayList<Ammunition> getFromDiapason(ArrayList<Ammunition> ammunition, double min, double max);

}
