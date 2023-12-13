package com.group2.nbapi_fpgroup2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //In this method it specifies when the Teams button gets pressed switch to the teams menu
    public void switchToMenu(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("MenuScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //In this method it specifies when the Menu button gets pressed switch to the teams menu
    public void switchToTeamsMenu(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TeamScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}