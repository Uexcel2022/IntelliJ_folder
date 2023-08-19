module com.webview.webview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.webview.webview to javafx.fxml;
    exports com.webview.webview;
}