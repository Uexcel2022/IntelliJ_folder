package com.validation.validation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Welcome {
    @FXML
    private Label nameLabel;
    protected Label changeLabel(){
        return nameLabel;
    }

    }

