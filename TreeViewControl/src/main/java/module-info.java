module com.treeview.treeviewcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.treeview.treeviewcontrol to javafx.fxml;
    exports com.treeview.treeviewcontrol;
}