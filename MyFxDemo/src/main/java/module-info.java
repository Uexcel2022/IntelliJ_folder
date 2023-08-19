module com.example.myfxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfxdemo to javafx.fxml;
    exports com.example.myfxdemo;
}