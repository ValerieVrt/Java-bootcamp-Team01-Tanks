package edu.school21.clientTanks.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Controller {
    @FXML
    private ImageView player;

    private Scene scene;

    public Controller(Scene scene) {
        this.scene = scene;
    }

    @FXML
    public void initialize() {

    }
    public void moveTank(int newPosition) {
        player.setTranslateX(newPosition);
    }
}
