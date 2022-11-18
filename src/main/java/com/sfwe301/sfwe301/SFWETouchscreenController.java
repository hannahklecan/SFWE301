package com.sfwe301.sfwe301;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SFWETouchscreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the University of Arizona Department of Software Engineering!");
    }
}