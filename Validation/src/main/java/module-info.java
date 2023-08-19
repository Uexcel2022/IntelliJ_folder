module com.validation.validation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.validation.validation to javafx.fxml;
    exports com.validation.validation;
}