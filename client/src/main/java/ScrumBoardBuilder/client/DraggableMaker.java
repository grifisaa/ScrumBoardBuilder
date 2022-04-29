package com.example.scrumtool;

//CS 3321 - 01, 02 / INFO 3307 - 01, 02: Intro to Software Engineering (IGriffith)
//Team 04- Project
//ScrumTool
//Client front end -Sushan,
// Web front end - Grant,
// Server- Coby


import javafx.scene.Node;
//CLass to make scrumcard draggable
public class DraggableMaker {

    private double mouseAnchorX;
    private double mouseAnchorY;

    public void makeDraggable(Node node){

        node.setOnMousePressed(mouseEvent -> {
            mouseAnchorX = mouseEvent.getX();
            mouseAnchorY = mouseEvent.getY();
        });

        node.setOnMouseDragged(mouseEvent -> {
            node.setLayoutX(mouseEvent.getSceneX() - mouseAnchorX);
            node.setLayoutY(mouseEvent.getSceneY() - mouseAnchorY);
        });
    }
}