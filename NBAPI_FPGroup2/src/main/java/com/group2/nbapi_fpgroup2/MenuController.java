package com.group2.nbapi_fpgroup2;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class MenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    //Setting up the columns
    @FXML
    private TableView<Teams> tableView;
    @FXML
    private TableColumn<Teams, Integer> IDColumn;
    @FXML
    private TableColumn<Teams, String> TeamsColumn;
    @FXML
    private TableColumn<Teams, String> AbbreviationColumn;
    @FXML
    private TableColumn<Teams, String> CityColumn;
    @FXML
    private TableColumn<Teams, String> ConferenceColumn;
    @FXML
    private TableColumn<Teams, String> DivisionColumn;


    private ObservableList<Teams> teamsList = FXCollections.observableArrayList();

    public void initialize(URL url, ResourceBundle resourceBundle){


        //Assign the items to the table view
        tableView.setItems(teamsList);

        //Defining what will be in each cell
        IDColumn.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getId()).asObject());
        TeamsColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getFull_name()));
        AbbreviationColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAbbreviation()));
        CityColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCity()));
        ConferenceColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getConference()));
        DivisionColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDivision()));


    }



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