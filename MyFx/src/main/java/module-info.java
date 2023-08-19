module com.example.myfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfx to javafx.fxml;
    exports com.example.myfx;
}