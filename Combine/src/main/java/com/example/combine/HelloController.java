package com.example.combine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    TextField nameTextFiled;
    FXMLLoader loader;
    Scene scene;
    Stage stage;

    Parent root;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Controller userName = loader.getController();
        userName.logIn(nameTextFiled.getText());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}