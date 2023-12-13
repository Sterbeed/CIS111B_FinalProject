package com.group2.nbapi_fpgroup2;

import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class MenuController {

    public TextArea textArea;
    private Stage stage;
    private Scene scene;
    private Parent root;


    //In this method it specifies when the Teams button gets pressed switch to the teams menu
    public void switchToMenu(ActionEvent event) throws Exception {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MenuScene.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //In this method it specifies when the Menu button gets pressed switch to the teams menu
    public void switchToTeamsMenu(ActionEvent event) throws Exception {


        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TeamScene.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        displayTeamsData();
    }

    @FXML
    public void displayTeamsData() throws Exception {
        //Calling the NBA API for teams.
        URL urlTeams = new URL("https://www.balldontlie.io/api/v1/teams");
        Scanner JsonScan1 = new Scanner(urlTeams.openStream());

        //Using the data from the Json scans and putting them into a String called rawData.
        StringBuilder rawDataTeams = new StringBuilder();

        while (JsonScan1.hasNextLine()) {
            rawDataTeams.append(JsonScan1.nextLine());
        }

        //Creating a gson object
        Gson gson = new Gson();
        TeamsList teamsList = gson.fromJson(rawDataTeams.toString(), TeamsList.class);

        //Accessing team data from TeamsList object
        Teams[] teams = teamsList.getData();

        textArea.setText(Arrays.toString(teams));
    }
}




