package com.example.scrumtool;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

////this is the file app
//public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainBoard.fxml"));
//
//
//
//        //////////////////////////////
//        Button button = new Button();
//
//
//        Scene scene = new Scene(fxmlLoader.load(), 900, 900);
//        stage.setTitle("ScrumBag!!!");
//        stage.setScene(scene);
//        stage.show();
//    }
////        root.setCenter(button);
//
//    public static void main(String[] args) {
//        launch();
//    }
//}

public class HelloApplication extends Application {

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