package com.listview.listview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label fruitLabel;
    @FXML
    ListView <String> listView;

    String[] fruits ={"apple","banana", "pineapple", "orange"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(fruits);

        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                String selectedItem = listView.getSelectionModel().getSelectedItem();
                selectedItem = String.valueOf(selectedItem.charAt(0)).toUpperCase()+selectedItem.substring(1);
                fruitLabel.setText(selectedItem);
            }
        });

    }



}