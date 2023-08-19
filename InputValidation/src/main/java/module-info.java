module com.validation.inputvalidation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.validation.inputvalidation to javafx.fxml;
    exports com.validation.inputvalidation;
}