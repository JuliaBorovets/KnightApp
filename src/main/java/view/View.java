package main.java.view;

import main.java.controller.Language;
import main.java.model.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.ResourceBundle;

import static main.java.view.TextConstant.*;

/**
 * Main View class
 * <p>
 * Created by Yuliia on 21.02.2020.
 *
 * @author Yuliia Borovets
 **/

public class View {

    /**
     * Name to the bundle to search
     */
    static String BUNDLE_NAME = "text";

    /**
     * Current language. Default - ukrainian
     */
    static Language currLanguage = Language.UKRAINIAN_LANG;

    public ResourceBundle bundle;

    public View() {
        currLanguage = Language.ENGLISH_LANG;
    }

    public void setLocalization(Language language) {
        currLanguage = language;
        bundle = ResourceBundle.getBundle(BUNDLE_NAME, Language.determineLocale(language));
    }

    /**
     * Prints menu
     */
    public void printBaseMenu() {
        printMessage(bundle.getString(INPUT_STRING_DATA));
    }

    /**
     * Prints about the end of the program
     */

    public void printEndOfProgram() {
        printMessage(bundle.getString(END_PROGRAM));
    }

    public void printMessage(String string) {
        System.out.println(string);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString.append(v);
        }
        return new String(concatString);
    }

    public void printMessage(String... message) {
        printMessage(concatenationString(message));
    }

    /**
     * Prints about incorrect input
     */

    public void printWrongStringInput() {
        printMessage(concatenationString(bundle.getString(INPUT_ERROR), bundle.getString(INPUT_STRING_DATA)));
    }

    /**
     * Prints Ammunition
     *
     * @param result - ArrayList of Ammunition
     */
    public void printAmmunition(ArrayList<Ammunition> result) {
        for (Ammunition a : result) {
            System.out.println(a);
        }
    }

}
