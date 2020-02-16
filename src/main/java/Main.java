package main.java;

import main.java.controller.Controller;
import main.java.model.Model;
import main.java.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
