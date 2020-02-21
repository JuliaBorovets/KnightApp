package main.java.view;

import main.java.controller.Language;
import main.java.model.ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import static main.java.view.TextConstant.*;

public class View {

    static String BUNDLE_NAME = "text";
    static Language currLanguage = Language.UKRAINIAN_LANG;
    public ResourceBundle bundle;

    public View() {
        currLanguage = Language.ENGLISH_LANG;
    }


    public void setLocalization(Language language) {
        currLanguage = language;
        bundle = ResourceBundle.getBundle(BUNDLE_NAME, Language.determineLocale(language));
    }

    public void printBaseMenu() {
        printMessage(bundle.getString(INPUT_STRING_DATA));
    }

    public void printEndOfGame() {
        printMessage(bundle.getString(END_GAME));
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

    public void printStringInput(String message) {
        printMessage(concatenationString(bundle.getString(INPUT_STRING_DATA), bundle.getString(message)));
    }

    public void printWrongStringInput() {
        printMessage(concatenationString(bundle.getString(INPUT_ERROR), bundle.getString(INPUT_STRING_DATA)));
    }

    public void printAmmunition(ArrayList<Ammunition> result) {
        for (Ammunition a : result) {
            System.out.println(a);
        }
    }

}
