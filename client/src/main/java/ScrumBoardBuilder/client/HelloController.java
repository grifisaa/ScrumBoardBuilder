package ScrumBoardBuilder.client;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController{
    private App app;

    public HelloController(App app){
        this.app = app;
    };
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}