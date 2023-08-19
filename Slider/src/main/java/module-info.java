module com.slider.slider {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.slider.slider to javafx.fxml;
    exports com.slider.slider;
}