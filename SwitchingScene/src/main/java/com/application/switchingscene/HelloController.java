package com.application.switchingscene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Scene scene;
    private Stage stage;
    private FXMLLoader fxmlLoader;

    public void switchScene(ActionEvent e) {
        try {
            fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello-view.fxml"));
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();
        } catch (IOException ioException) {
            System.out.println("Error occurred");
        }
    }

    public void switchScene2(ActionEvent e) {
        try {
            fxmlLoader = new FXMLLoader(HelloController.class.getResource("hello2-view.fxml"));
            stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();

        } catch (IOException ioException) {
            System.out.println("Error occurred");
        }
    }
}