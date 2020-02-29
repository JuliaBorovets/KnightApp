package main.java.controller;

import main.java.model.Model;
import main.java.model.ammunition.Ammunition;
import main.java.view.View;

import java.util.ArrayList;
import java.util.Scanner;

import static main.java.controller.RegexContainer.REGEX_NUMBER;
import static main.java.view.TextConstant.*;

/**
 * Created by Yuliia Borovets on 2020-02-21
 * Main Controller class
 *
 * @author Yuliia Borovets
 **/

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

    /**
     * Сhecks user input
     *
     * @param sc - scanner
     */

    public int inputValueWithScanner(Scanner sc) {
        int res;
        while (!(sc.hasNextInt() && Integer.toString(res = sc.nextInt()).matches(REGEX_NUMBER))) {
            view.printWrongStringInput();
            sc.next();
        }
        return res;
    }

    /**
     * Method to check value to choose language
     *
     * @param sc - scanner
     */
    public int inputLanguageWithScanner(Scanner sc) {
        while (!(sc.hasNextInt())) {
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Choosing language
     *
     * @param sc - scanner
     */
    public void chooseLanguage(Scanner sc) {
        Language language;
        for (Language option : Language.values()) {
            view.printMessage(option.getUserPrompt());
        }
        language = (inputLanguageWithScanner(sc) == 1) ? Language.UKRAINIAN_LANG : Language.ENGLISH_LANG;
        view.setLocalization(language);
    }

    /**
     * Performs operations depending on the user input
     *
     * @param sc - scanner
     */
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
                    int totalPrice = model.calculateTotalPrice(amm);
                    view.printMessage(TOTAL_PRICE, Integer.toString(totalPrice));
                    break;
                case 4:
                    view.printMessage(INPUT_MIN);
                    int min = inputValueWithScanner(sc);
                    view.printMessage(INPUT_MAX);
                    int max = inputValueWithScanner(sc);
                    amm = model.getFromRange(amm, min, max);
                    view.printAmmunition(amm);
                    break;
                case 5:
                    view.printMessage(CHOOSE_SIZE);
                    int size = inputValueWithScanner(sc);

                    if (size == 1) {
                        amm = model.chooseSize(amm, SIZE_S);
                    } else if (size == 2) {
                        amm = model.chooseSize(amm, SIZE_M);
                    } else if (size == 3) {
                        amm = model.chooseSize(amm, SIZE_L);
                    } else view.printWrongStringInput();
                    view.printAmmunition(amm);
                    break;
                case 6:
                    amm = model.getAmmunition();
                    break;
                case 7:
                    view.printEndOfProgram();
                    exit = true;
                    break;
            }
        }
    }
}
