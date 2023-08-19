module com.mediaview.mediaview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.mediaview.mediaview to javafx.fxml;
    exports com.mediaview.mediaview;
}