package com.sfwe301.sfwe301;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class SFWETouchscreenDriver extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SFWETouchscreenDriver.class.getResource("homepage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("SFWE301 Semester Project - HOMEPAGE");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");
        primaryStage.show();

        //only absolute paths seem to work for images
        Image icon = new Image("C:\\Users\\hanna\\Documents\\GitHub\\SFWE301\\src\\main\\resources\\images\\UA.png");
        //add UA icon to the window, could use UA logo multiple places
        primaryStage.getIcons().add(icon);

        Stage subStage1 = new Stage();
    }

    public static void main(String[] args) {
        launch();
    }
}