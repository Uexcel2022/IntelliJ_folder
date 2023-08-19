module com.progressbar.progressbar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.progressbar.progressbar to javafx.fxml;
    exports com.progressbar.progressbar;
}