package main.java.controller;

import main.java.model.Model;
import main.java.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputTextUser inputText = new InputTextUser(view, sc);
        inputText.choseOperation();
    }
}
