package com.example.myfxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
// root nodes > Scene > Stage


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Image icon = new Image("C:\\Users\\Uexcel\\IdeaProjects\\MyFxDemo\\src\\R.jpg");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setHeight(420);
        stage.setWidth(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press q to escape full Screen!");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.setTitle("My FX Demo");
         stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}