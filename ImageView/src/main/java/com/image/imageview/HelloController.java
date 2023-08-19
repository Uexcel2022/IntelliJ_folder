package com.image.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class HelloController {
    @FXML
    ImageView myViews;
    @FXML
    Button myButton;

    // the other images not chosen as default.
    Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Shrek.jpg")));

    @FXML
    protected void displayImage() {
        myViews.setImage(image);
    }
}