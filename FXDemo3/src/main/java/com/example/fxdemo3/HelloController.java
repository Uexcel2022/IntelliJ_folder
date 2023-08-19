package com.example.fxdemo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle; // Write this to id of circle
    private double x;
    private double y;

    public  void up(ActionEvent e){
        myCircle.setCenterY(y-=10);
//        System.out.println("up");
    }

    public  void down(ActionEvent e){
        myCircle.setCenterY(y+=10);
//        System.out.println("down");
    }
    public  void left(ActionEvent e){
        myCircle.setCenterX(x-=10);
//        System.out.println("left");
    }

    public  void right(ActionEvent e){
        myCircle.setCenterX(x+=10);
//        System.out.println("Right");
    }
}