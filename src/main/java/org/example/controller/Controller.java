package org.example.controller;

import org.example.view.ViewerOfToys;

import java.io.IOException;

public class Controller {
    public static void begin() throws IOException {
        ViewerOfToys ToyView = new ViewerOfToys();
        ToyView.start();
    }

}
