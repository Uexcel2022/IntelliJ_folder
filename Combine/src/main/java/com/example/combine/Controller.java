package com.example.combine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Label welcomeText;
    @FXML
    public void logIn(String userName)  {
        try {
            userName = String.valueOf(userName.charAt(0)).toUpperCase() +
                    userName.substring(1);
            welcomeText.setText("Welcome, " + userName);
        }catch (IndexOutOfBoundsException e){
            welcomeText.setText("Invalid input!");
        }
    }

}
