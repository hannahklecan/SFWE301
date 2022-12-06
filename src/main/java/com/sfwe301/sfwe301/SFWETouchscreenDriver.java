package com.sfwe301.sfwe301;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

//SFWE Touchscreen Application class
//controls the initial phase of the GUI (initialize primary stage, load the FXML file(s)
public class SFWETouchscreenDriver extends Application {
    @Override
    //within the driver class, we have a standard Java app start method
    public void start(Stage primaryStage) throws IOException {

        //initializing the homepage FXML and stage for the application
        Parent root = FXMLLoader.load(SFWETouchscreenDriver.class.getResource("HomeIdle.fxml"));
        //Scene scene = new Scene(fxmlLoader.load());
        Scene scene = new Scene(root);
        primaryStage.setTitle("SFWE301 Semester Project - HOMEPAGE");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.show();

        //direct link to U of A logo
        Image icon = new Image("https://brand.arizona.edu/sites/default/files/styles/uaqs_small/public/ua_block_rgb_3.png?itok=Q1eZqzk4");
        //add UA icon to the window, could use UA logo multiple places
        //creates the UA favicon for the application
        primaryStage.getIcons().add(icon);

    }

    //Main driver for the SFWE Touchscreen System
    public static void main(String[] args) {
        launch();
    }
}