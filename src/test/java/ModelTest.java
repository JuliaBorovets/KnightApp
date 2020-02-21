package test.java;

import main.java.controller.Controller;
import main.java.model.Model;
import main.java.model.ammunition.Ammunition;
import main.java.view.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static main.java.view.TextConstant.*;

/**
 * Testing Model class
 * Created by Yuliia Borovets on 2020-02-21
 *
 * @author Yuliia Borovets
 * @version 1.0
 */

public class ModelTest {

    Model model;
    View view;
    Controller controller;
    Scanner sc;

    @Before
    public void before() {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
        sc = new Scanner(System.in);
    }

    @Test
    public void sort() {
        boolean isSorted = false;
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        ammunition = model.sort(ammunition);
        for (int i = 0; i < ammunition.size() - 1; i++) {
            isSorted = ammunition.get(i).getWeight() > ammunition.get(i + 1).getWeight();
        }
        Assert.assertTrue(isSorted);
    }

    @Test
    public void getFromWrongDiapason() {
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        ammunition = model.getFromRange(ammunition, -10, -1);
        int afterSize = ammunition.size();
        Assert.assertEquals(0, afterSize);
    }

    @Test
    public void getFromDiapason() {
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        int preSize = ammunition.size();
        ammunition = model.getFromRange(ammunition, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int afterSize = ammunition.size();
        Assert.assertEquals(preSize, afterSize);

    }

    @Test
    public void chooseSizeS() {
        int counterS = 0;
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        for (Ammunition a : ammunition) {
            if (a.getSize().equals(SIZE_S)) {
                counterS++;
            }
        }
        ammunition = model.chooseSize(ammunition, SIZE_S);
        Assert.assertEquals(counterS, ammunition.size());

    }

    @Test
    public void chooseSizeM() {
        int counterM = 0;
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        for (Ammunition a : ammunition) {
            if (a.getSize().equals(SIZE_M)) {
                counterM++;
            }
        }
        ammunition = model.chooseSize(ammunition, SIZE_M);
        Assert.assertEquals(counterM, ammunition.size());

    }

    @Test
    public void chooseSizeL() {
        int counterL = 0;
        ArrayList<Ammunition> ammunition = model.getAmmunition();
        for (Ammunition a : ammunition) {
            if (a.getSize().equals(SIZE_L)) {
                counterL++;
            }
        }
        ammunition = model.chooseSize(ammunition, SIZE_L);
        Assert.assertEquals(counterL, ammunition.size());

    }
}