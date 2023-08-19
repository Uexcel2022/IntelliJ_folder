package com.datepicker.datepicker;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {
    @FXML
    private Label selectedDate;
    @FXML
    DatePicker dateText;
    @FXML
    protected void showDate() {
        LocalDate date = dateText.getValue();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        selectedDate.setText(formattedDate);
    }
}