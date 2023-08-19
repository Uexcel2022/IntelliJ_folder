module com.example.combine {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.combine to javafx.fxml;
    exports com.example.combine;
}