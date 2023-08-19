module com.colorchanger.colorchanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.colorchanger.colorchanger to javafx.fxml;
    exports com.colorchanger.colorchanger;
}