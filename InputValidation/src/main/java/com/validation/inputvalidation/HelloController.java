package com.validation.inputvalidation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField ageTextField;

    protected int age;


    @FXML
    protected void ageValidation() {

        try {
            age = Integer.parseInt(ageTextField.getText());

            if (age >= 18) {
                welcomeText.setText("You have now signed up!");
            } else {
                welcomeText.setText("You must be 18+");

            }

        } catch (NumberFormatException e) {
            welcomeText.setText("Enter only number please!");
        } catch (Exception e) {
            welcomeText.setText("error");

        }


    }
   @FXML
    protected void clearField() {
        if (!welcomeText.getText().isEmpty()) {
            if (welcomeText.getText().contains("18+") || welcomeText.getText().contains("only")) {
                ageTextField.setText("");
            }
        }

    }

}