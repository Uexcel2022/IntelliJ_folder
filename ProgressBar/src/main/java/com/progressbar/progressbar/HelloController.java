package com.progressbar.progressbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label progressLabel;
    @FXML
    ProgressBar progressBar;
//    BigDecimal progress = new BigDecimal(String.format("%.2f",0.00));
    String progress;
    @FXML
    protected void changeProgress() {
        if(progressBar.getProgress() < 1) {
            progress = String.format("%.2f",progressBar.getProgress()+0.1);
//            progress = new BigDecimal(String.format("%.2f",progressBar.getProgress()+0.1));
            progressBar.setProgress(Double.parseDouble(progress));
//            progressBar.setProgress(progress.doubleValue());
            int value = (int) Math.round((100 * progressBar.getProgress()));
            System.out.println(progressBar.getProgress());
            progressLabel.setText(value+"%");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setStyle("-fx-accent:#00ff00;");

    }
}