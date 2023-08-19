module com.application.applyingcss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.applyingcss to javafx.fxml;
    exports com.application.applyingcss;
}