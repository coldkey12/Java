package com.example.demo3.controllers;

import com.example.demo3.db.DBHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordTF;
    @FXML
    private TextField usernameTF;
    @FXML
    private Button signupButton;
    @FXML
    void initialize() {
        loginButton.setOnAction(event -> {
            String username = usernameTF.getText();
            String password = passwordTF.getText();
            DBHandler dbHandler = new DBHandler();
        });
        signupButton.setOnAction(actionEvent -> {
            try {
                signupButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/resources/com/example/demo3/signup.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            }catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
