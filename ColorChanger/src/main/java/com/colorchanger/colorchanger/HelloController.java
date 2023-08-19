package com.colorchanger.colorchanger;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    AnchorPane mainPane;
    @FXML
    ColorPicker colorPicked;

    @FXML
    protected void changeColor() {
        Color color = colorPicked.getValue();
        mainPane.setBackground(new Background(new BackgroundFill(color,
                null, null)));

    }
}