package com.example.scrumtool;

//import javafx.scene.Node;
//
//public class DraggableMaker {
//
//
//    private double mouseAnchorX;
//    private double mouseAnchorY;
//
//    public void makeDraggable(Node node) {
//
//        node.setOnMousePressed(e -> {
//            mouseAnchorX = e.getSceneX() -  node.getTranslateX();
//            mouseAnchorY = e.getSceneY()- node.getTranslateY();
//        });
//
//        node.setOnMouseDragged(e -> {
//            node.setLayoutX(e.getSceneX() - mouseAnchorX);
//            node.setLayoutY(e.getSceneY() - mouseAnchorY);
//        });
//    }
//}

import javafx.scene.Node;

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