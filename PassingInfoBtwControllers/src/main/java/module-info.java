module com.example.passinginfobtwcontrollers {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.passinginfobtwcontrollers to javafx.fxml;
    exports com.example.passinginfobtwcontrollers;
}