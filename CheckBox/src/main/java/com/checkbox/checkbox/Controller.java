package com.checkbox.checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Controller {
    @FXML
    private Label indicator;
    @FXML
    CheckBox myCheckBox;
    @FXML
    ImageView myView;

    Image image1 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("bulb1.jpg")));
    Image image2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("bulb2.png")));

    @FXML
    protected void change() {
        if(myCheckBox.isSelected()) {
            myView.setImage(image1);
            indicator.setText("ON");
        } else{
            indicator.setText("OF");
            myView.setImage(image2);
        }
    }
}