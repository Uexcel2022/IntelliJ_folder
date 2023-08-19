module com.application.switchingscene {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.switchingscene to javafx.fxml;
    exports com.application.switchingscene;
}