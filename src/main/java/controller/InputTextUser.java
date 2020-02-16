package main.java.controller;

import main.java.view.View;

import java.util.Scanner;

public class InputTextUser {

    private View view;
    private Scanner scanner;

    public InputTextUser(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public void inputText() {

    }

    String inputStringValueWithScanner(String message, String regex) {
        String res = "";
        view.printStringInput(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }

        return res;

    }
}
