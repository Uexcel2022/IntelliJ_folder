package com.spinner.spinner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label spinnerLabel;

    @FXML
    private Spinner <Integer> spinner;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinner.setValueFactory(new
                SpinnerValueFactory.IntegerSpinnerValueFactory(1,100));
        spinnerLabel.setText(Integer.toString(spinner.getValue()));
        spinner.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observableValue, Integer integer, Integer t1) {
                spinnerLabel.setText(Integer.toString(spinner.getValue()));
            }
        });
    }
}