package com.webview.webview;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private WebView webView;
    @FXML
    TextField textField;
    WebEngine webEngine;
    private double zoom = 0;

    private WebHistory history;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        textField.setText("www.google.com");
        zoom = 1;
        loadPage();
    }

    @FXML
    protected void loadPage() {
        webEngine.load("http://" + textField.getText());
    }

    @FXML
    protected void refresh() {
        webEngine.reload();
    }

    @FXML
    public void zoomIn() {
        if (zoom < 2) {
            zoom += 0.25;
            webView.setZoom(zoom);

        }
    }

    @FXML
    public void zoomOut() {
        if (zoom > 0.5) {
            zoom -= 0.25;
            webView.setZoom(zoom);
        }
    }

    @FXML
    protected void webHistory(){
        history = webEngine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        for(WebHistory.Entry entry: entries) {
            System.out.println(entry.getUrl()+ " "+ entry.getLastVisitedDate());
        }
    }

    @FXML
    protected void backward(){
        try {
            history = webEngine.getHistory();
            history.go(-1);
            ObservableList<WebHistory.Entry> entries = history.getEntries();
            textField.setText(entries.get(history.getCurrentIndex()).getUrl());
        } catch(Exception ignored){

        }
    }

    @FXML
    protected void forward(){
        try {
            history = webEngine.getHistory();
            history.go(1);
            ObservableList<WebHistory.Entry> entries = history.getEntries();
            textField.setText(entries.get(history.getCurrentIndex()).getUrl());
        } catch (Exception ignored){

        }
    }
    @FXML
    protected void executeJS(){
        webEngine.executeScript("window.location = \"http://www.youtube.com\";");
    }


}