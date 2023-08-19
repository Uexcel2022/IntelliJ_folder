module com.animation.animation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.animation.animation to javafx.fxml;
    exports com.animation.animation;
}