module com.datepicker.datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.datepicker.datepicker to javafx.fxml;
    exports com.datepicker.datepicker;
}