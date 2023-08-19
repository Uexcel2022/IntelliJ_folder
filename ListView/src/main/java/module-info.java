module com.listview.listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.listview.listview to javafx.fxml;
    exports com.listview.listview;
}