package main.java.view;

import main.java.controller.Language;
import main.java.model.ammunition.Ammunition;

import java.util.Locale;
import java.util.ResourceBundle;

import static main.java.view.TextConstant.INPUT_ERROR;
import static main.java.view.TextConstant.INPUT_STRING_DATA;

public class View {

    static String BUNDLE_NAME = "text";
    private Language currLanguage;
    private ResourceBundle bundle;

    public View() {
        currLanguage = Language.ENGLISH_LANG;
        setLocalization(currLanguage);
    }


    public void setLocalization(Language language) {
        currLanguage = language;
        bundle = ResourceBundle.getBundle(BUNDLE_NAME, Language.determineLocale(language));
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(bundle.getString(INPUT_STRING_DATA), bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(bundle.getString(INPUT_ERROR), bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}
