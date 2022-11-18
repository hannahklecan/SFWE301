package com.sfwe301.sfwe301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller class will handle any actions detected when running the application
 */
public class SFWETouchscreenController {
    @FXML
    private Label welcomeText;

    @FXML
    /**
     * Example action handling method, prints a message to the screen onclick of button
     */
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the University of Arizona Department of Software Engineering!");
    }

    @FXML
    private void programInfoClick(ActionEvent event) {
        // Button was clicked, do something...
        welcomeText.setText("Welcome to the University of Arizona Department of Software Engineering!");
    }
}