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


    String inputStringValueWithScanner(String message, String regex) {
        String res = "";
        view.printStringInput(message);
        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(message);
        }

        return res;

    }
//    public void choseOperation(Scanner sc){
//        inputStringValueWithScanner(TextConstant.INPUT_STRING_DATA, RegexContainer.REGEX_NUMBER);
//        int i = 0;
//        while (i<1 || i>5){
//            i = Integer.parseInt(inputStringValueWithScanner(TextConstant.INPUT_STRING_DATA, RegexContainer.REGEX_NUMBER));
//        }
//        switch (i){
//            case 4:
//                chooseLanguage(sc);
//            case 1:
//
//        }
//
//    }

    public void chooseLanguage(Scanner sc) {
        Language language;
        for (Language option : Language.values()) {
            view.printMessage(option.getUserPrompt());
        }

        language = (sc.nextInt() == 1) ? Language.UKRAINIAN_LANG : Language.ENGLISH_LANG;
        view.setLocalization(language);
    }
}
