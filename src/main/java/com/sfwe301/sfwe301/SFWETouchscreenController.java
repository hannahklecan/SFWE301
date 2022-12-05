package com.sfwe301.sfwe301;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.Animation;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


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
        //Possible animation
//        final Rectangle rect1 = new Rectangle(10, 10, 100, 100);
//        rect1.setArcHeight(20);
//        rect1.setArcWidth(20);
//        rect1.setFill(Color.RED);
//        FadeTransition ft = new FadeTransition(Duration.millis(3000), rect1);
//        ft.setFromValue(1.0);
//        ft.setToValue(0.1);
//        ft.setCycleCount(Timeline.INDEFINITE);
//        ft.setAutoReverse(true);
//        ft.play();
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
    private void switchToSFWEMajor(ActionEvent event) throws IOException {
//        MajorWebView = engine.getEngine();
//        engine.load("https://www.arizona.edu/degree-search/majors/software-engineering#sample-plan");
        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("SFWEMajor.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("SFWE301 Semester Project - SFWE MAJOR");
        stage.setScene(scene);
        stage.setFullScreen(true);
        //loadPage();
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