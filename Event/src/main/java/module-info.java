module com.event.event {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.event.event to javafx.fxml;
    exports com.event.event;
}