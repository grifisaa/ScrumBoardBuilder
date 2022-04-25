package com.example.scrumtool;



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

    @FXML
    private GridPane gpTable;





//https://stackoverflow.com/questions/44731969/create-multiple-textfields-with-a-delete-button-using-javafx-with-fxml
    @FXML
    public void AddTextField(ActionEvent event) {
        final HBox parent = new HBox(3.0); // 5.0 is the distance between the field and the button; hbox is the parent of both

        TextField field = new TextField();

        field.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 12));
//        field.setMaxHeight(60);
//        field.setBackground(Color.BLUE);
        field.setStyle("-fx-Border-color: Black");
        field.setStyle("-fx-background-color: Grey");

        field.setPrefHeight(45);
        field.setMaxWidth(90);
        field.setPickOnBounds(false);






        Button button = new Button("X"); // the button to "close" the textfield
        button.setStyle("-fx-background-color: red");
        button.setOnAction((e) -> pane_main_grid.getChildren().remove(parent)); // button click removes the hbox
        button.setPrefSize(5, 10); // only if you're using a custom font / styling
        HBox.setHgrow(field, Priority.ALWAYS); // field should always grow
        HBox.setHgrow(button, Priority.ALWAYS); // button should never grow

        parent.getChildren().setAll(field, button); // add the textfield and the button to the hbox
        pane_main_grid.getChildren().add(parent); // add the hbox to your main grid

        /////////////////////Grid Extension////////////////////////////////////////
        Label lbladdgrid = new Label("more");
        Button addGridColumn = new Button("+");
        GridPane gpTable = new GridPane();
        gpTable.add(lbladdgrid,1,2);
    }

    DraggableMaker draggableMaker = new DraggableMaker();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        AddTextField();
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
//        draggableMaker.makeDraggable(pane_main_grid.getChildren().setAll(field.));


        draggableMaker.makeDraggable(pane_main_grid);



    }


}