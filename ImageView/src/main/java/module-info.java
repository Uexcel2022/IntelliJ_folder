module com.image.imageview {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.image.imageview to javafx.fxml;
    exports com.image.imageview;
}