package com.choicebox.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label fruitLabel;
    @FXML
    ChoiceBox <String> options;
    String[]fruits = {"apple","banana", "mango", "pineapple", "orange"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        options.getItems().addAll(fruits);
        options.setOnAction(this::getOptionSelected);
    }
    @FXML
    protected void getOptionSelected(ActionEvent event) {
        String selectedFruit = options.getValue();
        selectedFruit = String.valueOf(selectedFruit.charAt(0)).toUpperCase()+
                selectedFruit.substring(1);
        fruitLabel.setText(selectedFruit);

    }
}