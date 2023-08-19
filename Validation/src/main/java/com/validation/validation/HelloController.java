package com.validation.validation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField userNameTextField;
    @FXML
    private PasswordField passWordTextField;
    @FXML
    protected Scene scene;
    @FXML
    protected Stage stage;
    @FXML
    protected Parent root;
    @FXML
    protected Label label, invalidCredentials;
    private final String userName;
    private final String password;
    private final String name;
    ValidateCredentials vc;

    public HelloController() {
        this.userName = "uexcel";
        this.password = "compromise#";
        this.name = "Udoka";
        vc = new HelloController.ValidateCredentials();
    }

    @FXML
    protected void validate(ActionEvent event) throws IOException {
        boolean confirmation = vc.validate(userNameTextField.getText(),
                userName, passWordTextField.getText(), password);
        if (confirmation) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Welcome.fxml"));
            root = fxmlLoader.load();
            scene = new Scene(root);
            Welcome welcome = fxmlLoader.getController();
            label = welcome.changeLabel();
            label.setText("Welcome, " + name);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Home");
            stage.setScene(scene);
            stage.show();
        } else invalidCredentials.setText("Invalid credentials!");

    }

    @FXML
    protected void reset() {
        userNameTextField.setText("");
        passWordTextField.setText("");
        invalidCredentials.setText("");
    }

    private static class ValidateCredentials {
        private Boolean validate(String userNameTextField,
                                 String userName, String passWordTextField, String password) {

            return userNameTextField.equals(userName)
                    && passWordTextField.equals(password);
        }

    }
}