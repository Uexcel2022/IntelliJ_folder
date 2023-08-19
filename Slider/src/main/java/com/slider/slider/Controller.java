package com.slider.slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label tempLabel;
    @FXML
    private Slider tempBar;

    @FXML
    protected void changeValue() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int currentVal = (int)tempBar.getValue();
        tempLabel.setText(String.valueOf(currentVal+"°C"));
        tempBar.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                int currentVal = (int)tempBar.getValue();
                tempLabel.setText(String.valueOf(currentVal+"°C"));

            }
        });

    }
}