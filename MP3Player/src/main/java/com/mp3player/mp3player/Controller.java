package com.mp3player.mp3player;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    @FXML
    private Button playButton, pauseButton, resetButton, previousButton, nextButton;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Slider volumeControl;
    @FXML
    ComboBox <String> comboBox;
    @FXML
    private Label songLabel;
    private int songNumber;
    private Timer timer;
    private TimerTask task;
    private  Boolean running;
    private int played = 0;

    private double volume = 0.5;
    protected Media media;
    private MediaPlayer mediaPlayer;

    protected File directory;
    protected File[] files;
    private ArrayList<File>songs;
    private final String[] speed = {"default", "25", "50","75", "100", "125","150","175","200"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs = new ArrayList<>();
        directory = new File("music");
        files = directory.listFiles();
        if(files != null){
            Collections.addAll(songs, files);
            loader();

        }

        for(String n: speed) {
            if (n.equals("default")) {
                comboBox.getItems().addAll(n);
            } else comboBox.getItems().addAll(n + "%");
        }

        comboBox.setValue("default");
        comboBox.setOnAction(this::changeSpeed);

        volumeControl.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                mediaPlayer.setVolume(volumeControl.getValue()*0.01);
                volume = mediaPlayer.getVolume();
//
            }
        });
//        continuation();
        progressBar.setStyle("-fx-accent:#00FF00;");




    }

    protected  void loader(){
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        songLabel.setText(songs.get(songNumber).getName());
    }

    @FXML
    protected void playMedia() {
        mediaPlayer.setVolume(volume);
        changeSpeed(null);
        played++;
        beginTime();
        mediaPlayer.play();

    }

    @FXML
    protected void pauseMedia() {
        if (mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING){
            mediaPlayer.pause();
            endTimer();
        }


    }
    @FXML
    protected void resetMedia() {
        if(mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.seek(Duration.millis(0.00));
            played = 0;
            comboBox.setValue("default");
            changeSpeed(null);
            endTimer();
            progressBar.setProgress(0);
        }
    }

    @FXML
    protected void previousMedia() {

        if(songNumber > 0){
            mediaPlayer.stop();
            songNumber--;
            loader();
            if (played > 0) {
                playMedia();
            }
        }

    }

    @FXML
    protected void nextMedia() {
        if(songNumber < songs.size()-1){
            mediaPlayer.stop();
            songNumber++;

        } else{
            songNumber = 0;
            mediaPlayer.stop();
        }

        loader();
        if (played > 0) {
            playMedia();
        }

    }
    @FXML
    protected void changeSpeed(ActionEvent event) {
        if(comboBox.getValue().equals("default")){
            mediaPlayer.setRate(1.0);
        } else {
            mediaPlayer.setRate(Integer.parseInt(comboBox.getValue().substring(0,
                    comboBox.getValue().length() - 1))*0.01);
        }
    }


    protected void beginTime(){
        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                running =true;
                double current = mediaPlayer.getCurrentTime().toSeconds();
                double end = media.getDuration().toSeconds();
                    progressBar.setProgress(current / end);
                    if (current / end == 1) {
                        endTimer();
                    }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);
    }

    private void  endTimer(){
        running = false;
        timer.cancel();

    }

}

