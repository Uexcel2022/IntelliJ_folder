module com.spinner.spinner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spinner.spinner to javafx.fxml;
    exports com.spinner.spinner;
}