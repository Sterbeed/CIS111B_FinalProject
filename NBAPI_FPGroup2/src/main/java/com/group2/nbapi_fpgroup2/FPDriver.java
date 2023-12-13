package com.group2.nbapi_fpgroup2;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class FPDriver extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuScene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        //Calling the NBA API for teams.
        URL urlTeams = new URL("https://www.balldontlie.io/api/v1/teams");
        Scanner JsonScan1 = new Scanner(urlTeams.openStream());

        //Using the data from the Json scans and putting them into a String called rawData.
        StringBuilder rawDataTeams = new StringBuilder();

        while (JsonScan1.hasNextLine())
        {
            rawDataTeams.append(JsonScan1.nextLine());
        }

        //Creating a gson object
        Gson gson = new Gson();
        TeamsList teamsList = gson.fromJson(rawDataTeams.toString(), TeamsList.class);

        //Accessing team data from TeamsList object
        Teams[] teams = teamsList.getData();

        //Print details for all teams
        if (teams != null)
        {
            for (Teams team : teams)
            {
                System.out.println(team.toString());
            }
        }

        //Launch the program
        launch();
    }

}