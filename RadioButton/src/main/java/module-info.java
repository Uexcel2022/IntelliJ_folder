module com.radiobutton.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radiobutton.radiobutton to javafx.fxml;
    exports com.radiobutton.radiobutton;
}