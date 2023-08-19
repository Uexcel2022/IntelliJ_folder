module com.mp3player.mp3player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.mp3player.mp3player to javafx.fxml;
    exports com.mp3player.mp3player;
}