package com.radiobutton.radiobutton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {
    @FXML
    private Label myLabel;
    @FXML
    private RadioButton rBanana;
    @FXML
    private RadioButton rOrange;
    @FXML
    private RadioButton rApple;
    @FXML
    private ToggleGroup fruits;

    @FXML
    protected void selectedButton() {

        if (rApple.isSelected()) {
            myLabel.setText(rApple.getText());
        }

        if (rOrange.isSelected()) {
            myLabel.setText(rOrange.getText());
        }

        if (rBanana.isSelected()) {
            myLabel.setText(rBanana.getText());
        }

    }

//        if(fruits.getSelectedToggle() == rApple){
//            myLabel.setText("Apple");
//        }
//
//        if(fruits.getSelectedToggle() == rOrange){
//            myLabel.setText("Orange.");
//        }
//
//        if(fruits.getSelectedToggle() == rBanana){
//            myLabel.setText("Banana");
//        }


}