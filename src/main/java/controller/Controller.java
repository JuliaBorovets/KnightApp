package main.java.controller;

import main.java.model.Model;
import main.java.model.ammunition.Ammunition;
import main.java.view.View;

import java.util.ArrayList;
import java.util.Scanner;

import static main.java.view.TextConstant.*;

public class Controller {

    private Model model;
    private View view;
    public static Scanner sc;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        sc = new Scanner(System.in);
        chooseLanguage(sc);
        processMenu(sc);
    }

    public int inputValueWithScanner(Scanner sc) {
        while (!sc.hasNextInt() && (sc.nextInt() < 1 || sc.nextInt() > 6)) {
            view.printWrongStringInput();
        }
        return sc.nextInt();
    }

    public void chooseLanguage(Scanner sc) {
        Language language;
        for (Language option : Language.values()) {
            view.printMessage(option.getUserPrompt());
        }
        language = (sc.nextInt() == 1) ? Language.UKRAINIAN_LANG : Language.ENGLISH_LANG;
        view.setLocalization(language);
    }

    public void processMenu(Scanner sc) {
        boolean exit = false;
        int num;

        ArrayList<Ammunition> sortedAmm;
        ArrayList<Ammunition> amm = model.getAmmunition();

        while (!exit) {
            view.printBaseMenu();
            num = inputValueWithScanner(sc);
            switch (num) {
                case 1:
                    view.printAmmunition(amm);
                    break;
                case 2:
                    sortedAmm = model.sort(amm);
                    amm = sortedAmm;
                    view.printAmmunition(amm);
                    break;
                case 3:
                    double totalPrice = model.calculateTotalPrice(amm);
                    view.printMessage(TOTAL_PRICE, Double.toString(totalPrice));
                    break;
                case 4:
                    view.printMessage(INPUT_MIN);
                    int min = inputValueWithScanner(sc);
                    view.printMessage(INPUT_MAX);
                    int max = inputValueWithScanner(sc);
                    amm = model.getFromDiapason(amm, min, max);
                    view.printAmmunition(amm);
                    break;
                case 5:
                    view.printEndOfGame();
                    exit = true;
                    break;
            }
        }

    }

}
