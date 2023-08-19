package com.logout.logout;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController{
    @FXML
    AnchorPane scenePane;
     Stage stage;
    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You about to logout.");
        alert.setContentText("Do you want to save before exiting?");

        if(alert.showAndWait().get()==ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }

    }
}