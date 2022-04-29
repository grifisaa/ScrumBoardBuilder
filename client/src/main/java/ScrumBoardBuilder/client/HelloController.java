<<<<<<< HEAD:clientfrontend/ScrumTool/src/main/java/com/example/scrumtool/HelloController.java
package com.example.scrumtool;
//CS 3321 - 01, 02 / INFO 3307 - 01, 02: Intro to Software Engineering (IGriffith)
//Team 04- Project
//ScrumTool
//Client front end -Sushan,
// Web front end - Grant,
// Server- Coby



=======
package ScrumBoardBuilder.client;
>>>>>>> 7242a1d6cddc31517af2cb4f4b116837c300e371:client/src/main/java/ScrumBoardBuilder/client/HelloController.java



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


import javafx.scene.text.Text;


public class HelloController implements Initializable {


//importing from the mainBoard.fxml file
    @FXML
    private TextField txtField1;
    @FXML
    private TextField txtField2;
    @FXML
    private TextField txtField3;
    @FXML
    private TextField txtField4;
    @FXML
    private TextField txtField5;
    @FXML
    private TextField txtField6;
    @FXML
    private TextField txtField7;
    @FXML
    private TextField txtField8;
    @FXML
    private TextField txtField9;
    @FXML
    private TextField txtField10;

    @FXML
    private Button button;

    @FXML
    private Button addGridColumn;


//    @FXML
//    private HBox parent;

    @FXML
    private VBox pane_main_grid;

<<<<<<< HEAD:client/src/main/java/ScrumBoardBuilder/client/HelloController.java
public class HelloController{
    private App app;

    public HelloController(App app){
        this.app = app;
    };
=======
>>>>>>> f2852640b915af088df5d17991c7ae57006c51f9:clientfrontend/ScrumTool/src/main/java/com/example/scrumtool/HelloController.java
    @FXML
    private GridPane gpTable;




//Credit
//https://stackoverflow.com/questions/44731969/create-multiple-textfields-with-a-delete-button-using-javafx-with-fxml
    @FXML
    public void AddTextField(ActionEvent event) {
        //Here 3.0 is distance between field and button where Hbox is parent
        final HBox parent = new HBox(3.0);

        TextField field = new TextField();
        //Changef the textfield font as comic sans bold and size as 12
        field.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 12));
        //field boarder= black
        field.setStyle("-fx-Border-color: Black");
        //field boarder= black
        field.setStyle("-fx-background-color: Grey");
        // Set dimension (52*90)
        field.setPrefHeight(45);
        field.setMaxWidth(90);
        field.setPickOnBounds(false);





        //Red button to close the generated
        //scrum card previously generated clicking '+" button
        Button button = new Button("X");
        button.setStyle("-fx-background-color: red");
        // button click removes the hbox
        button.setOnAction((e) -> pane_main_grid.getChildren().remove(parent));
        button.setPrefSize(5, 10);
        //field and button always grows
        HBox.setHgrow(field, Priority.ALWAYS);
        HBox.setHgrow(button, Priority.ALWAYS);
        // add the textfield and the button to the hbox
        parent.getChildren().setAll(field, button);
        // add the hbox to your main grid
        pane_main_grid.getChildren().add(parent);

        /////////////////////Grid Extension////////////////////////////////////////
        Label lbladdgrid = new Label("more");
        Button addGridColumn = new Button("+");
        GridPane gpTable = new GridPane();
        gpTable.add(lbladdgrid,1,2);
    }
    //makes the object(Scrum card) draggable
    DraggableMaker draggableMaker = new DraggableMaker();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Makes Default scrumcard f=draggable
        draggableMaker.makeDraggable(txtField1);
        draggableMaker.makeDraggable(txtField2);
        draggableMaker.makeDraggable(txtField3);
        draggableMaker.makeDraggable(txtField4);
        draggableMaker.makeDraggable(txtField5);
        draggableMaker.makeDraggable(txtField6);
        draggableMaker.makeDraggable(txtField7);
        draggableMaker.makeDraggable(txtField8);
        draggableMaker.makeDraggable(txtField9);
        draggableMaker.makeDraggable(txtField10);

        //Makes the whole grid draggable(NOT THE INDIVIDUAL ADDED SCRUM CARD!!!)
        draggableMaker.makeDraggable(pane_main_grid);



    }


}