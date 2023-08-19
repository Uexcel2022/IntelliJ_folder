module com.checkbox.checkbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.checkbox.checkbox to javafx.fxml;
    exports com.checkbox.checkbox;
}