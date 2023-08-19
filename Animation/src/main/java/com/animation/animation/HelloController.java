package com.animation.animation;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.Axis;
import javafx.scene.control.Label;
import javafx.scene.shape.Arc;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    //Animation  = TranslateTransition, RotateTransition,
                  // FadeTransition and ScaleTransition

    @FXML
    private Arc myArc;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        TranslateTransition trn = new TranslateTransition();
//        trn.setCycleCount(2);
//        trn.setCycleCount(TranslateTransition.INDEFINITE);
//        trn.setDuration(Duration.millis(1000));
//        trn.setAutoReverse(true);
//        trn.setByX(250);
//        trn.setByY(500);
//        trn.setNode(myArc);
//        trn.play();


//        RotateTransition transition = new RotateTransition();
//        transition.setCycleCount(TranslateTransition.INDEFINITE);
//        transition.setDuration(Duration.millis(1000));
//        transition.setAutoReverse(true);
//        transition.setByAngle(360);
//        transition.setInterpolator(Interpolator.LINEAR);
//        transition.setAxis(Rotate.X_AXIS);
//        transition.setAxis(Rotate.Y_AXIS);
//        transition.setAxis(Rotate.Z_AXIS); //default;
//        transition.setFromAngle(0);
//        transition.setToAngle(180);
//        transition.setNode(myArc);
//        transition.play();


//        RotateTransition transition = new RotateTransition();
//        transition.setCycleCount(TranslateTransition.INDEFINITE);
//        transition.setDuration(Duration.millis(1000));
//        transition.setAutoReverse(true);
//        transition.setByAngle(360);
//        transition.setInterpolator(Interpolator.LINEAR);
//        transition.setAxis(Rotate.X_AXIS);
//        transition.setAxis(Rotate.Y_AXIS);
//        transition.setAxis(Rotate.Z_AXIS); //default;
//        transition.setFromAngle(0);
//        transition.setToAngle(180);

//
//        FadeTransition fade = new FadeTransition();
//        fade.setDuration(Duration.millis(10000));
////        fade out
////        fade.setFromValue(1);
////        fade.setToValue(0);
//
////         fade in
//        fade.setFromValue(0);
//        fade.setToValue(1);
//        fade.setNode(myArc);
//        fade.play();

        ScaleTransition scale = new ScaleTransition();
        scale.setDuration(Duration.millis(1000));
        scale.setByX(0.5);
        scale.setByY(0.5);
        scale.setNode(myArc);
        scale.play();

    }
}