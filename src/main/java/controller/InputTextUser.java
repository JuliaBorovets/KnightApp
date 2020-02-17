package main.java.controller;

import main.java.view.TextConstant;
import main.java.view.View;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InputTextUser {

    private View view;
    private Scanner scanner;

    public InputTextUser(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }


    String inputStringValueWithScanner(String message, String regex) {
        String res = "";
        view.printStringInput(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }

        return res;

    }
    public void choseOperation(){
        int i = 0;
        while (i<1 || i>5){
            i = Integer.parseInt(inputStringValueWithScanner(TextConstant.INPUT_STRING_DATA, RegexContainer.REGEX_NUMBER));
        }
//        switch (i){
//
//        }

    }
}
