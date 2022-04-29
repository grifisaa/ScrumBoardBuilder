package com.example.scrumtool;
//CS 3321 - 01, 02 / INFO 3307 - 01, 02: Intro to Software Engineering (IGriffith)
//Team 04- Project
//ScrumTool
//Client front end -Sushan,
// Web front end - Grant,
// Server- Coby


//Imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class HelloApplication extends Application {
//IO Exception
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainBoard.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 900);




        stage.setTitle("Scrum Board Builder");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();


    }
}