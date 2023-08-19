package com.event.event;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void up() {
        System.out.println("UP");
    }
    @FXML
    protected void down() {
        System.out.println("Down");
    }
    @FXML
    protected void left() {
        System.out.println("Left");
    }
    @FXML
    protected void right() {
        System.out.println("Right");
    }
}