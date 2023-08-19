package com.application.switchingscene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException ioException) {
            System.out.println("Error occurred");
        }
    }

    public static void main(String[] args) {
        launch();
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("javafx.version"));

    }
}