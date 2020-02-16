package main.java.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String BUNDLE_NAME = "text";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME,
            new Locale("ua", "UA"));

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printStringInput(String message) {
    }

    public void printWrongStringInput(String message) {
    }
}
