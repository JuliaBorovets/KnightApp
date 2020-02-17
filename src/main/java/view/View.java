package main.java.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static main.java.view.TextConstant.INPUT_ERROR;
import static main.java.view.TextConstant.INPUT_STRING_DATA;

public class View {

    static String BUNDLE_NAME = "text";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME,
            new Locale("ua", "UA"));
    //          new Locale("en"));


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
