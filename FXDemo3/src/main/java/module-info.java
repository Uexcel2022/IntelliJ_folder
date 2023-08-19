module com.example.fxdemo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxdemo3 to javafx.fxml;
    exports com.example.fxdemo3;
}