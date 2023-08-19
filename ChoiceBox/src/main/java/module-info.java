module com.choicebox.choicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.choicebox.choicebox to javafx.fxml;
    exports com.choicebox.choicebox;
}