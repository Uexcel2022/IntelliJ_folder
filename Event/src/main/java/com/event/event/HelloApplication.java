package com.event.event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Parent root;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        root = fxmlLoader.load();
        HelloController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);

        stage.setTitle("Event");
        stage.setScene(scene);

        //lambda express
        scene .setOnKeyPressed(event ->{

//        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
//            @Override
//            public void handle(KeyEvent event) {

                switch (event.getCode()) {
                    case UP -> controller.up();
                    case DOWN -> controller.down();
                    case RIGHT -> controller.right();
                    case LEFT -> controller.left();
                }

//            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}