package com.example.scrumtool;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
//    @FXML
//    private Label welcomeText;

    @FXML
    private Rectangle rectangle;

    @FXML
    private AnchorPane anchorPane;



    DraggableMaker draggableMaker = new DraggableMaker();

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        draggableMaker.makeDraggable(rectangle);
        draggableMaker.makeDraggable(anchorPane);
    }

}