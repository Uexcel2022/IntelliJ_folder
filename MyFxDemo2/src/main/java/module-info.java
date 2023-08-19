module com.example.myfxdemo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfxdemo2 to javafx.fxml;
    exports com.example.myfxdemo2;
}