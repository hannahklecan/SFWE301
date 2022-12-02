package com.sfwe301.sfwe301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller class will handle any actions detected when running the application
 */
public class SFWETouchscreenController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public Button programInfo;
    @FXML
    private Label welcomeText;


    @FXML
    private void switchToHomepage(ActionEvent event) throws IOException{

        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("homepage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("SFWE301 Semester Project - HOMEPAGE");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }
    @FXML
    private void switchToProgramInfo(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("ProgramInformation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("SFWE301 Semester Project - PROGRAM INFO");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }

    @FXML
    private void switchToAcademicResources(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("AcademicResourcePage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("SFWE301 Semester Project - ACADEMIC RESOURCES");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }

    @FXML
    private void switchToStudentEngagement(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("StudentEngagement.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("SFWE301 Semester Project - STUDENT ENGAGEMENT");
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.show();
    }

    @FXML
    /**
     * Example action handling method, prints a message to the screen onclick of button
     */
    protected void onHelloButtonClick(ActionEvent event) {

        welcomeText.setText("Welcome to the University of Arizona Department of Software Engineering!");
    }

    @FXML
    private void programInfoClick(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("Program Info Button Clicked");
        welcomeText.setText("Welcome to the University of Arizona Department of Software Engineering!");
    }
}