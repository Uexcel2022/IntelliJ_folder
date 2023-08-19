module com.logout.logout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.logout.logout to javafx.fxml;
    exports com.logout.logout;
}