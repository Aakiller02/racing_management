package com.packages;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.packages.mainclasses.SportCar;

// import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class racingMenu implements Initializable {

    @FXML private TextField brandText;
    @FXML private TextField modelText;
    @FXML private TextField engineText;
    @FXML private TextField frontText;
    @FXML private TextField rearText;
    @FXML private TextField gNameText;
    @FXML private TextField gLocText;
    @FXML private TextField gIDText;
    @FXML private TextField dNameText;
    @FXML private TextField dTeamText;
    @FXML private TextField dIDText;
    SportCar car = App.getCurrentCar();

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        brandText.setText(car.getBrand());
        modelText.setText(car.getModel());
        engineText.setText(car.engineType());
        frontText.setText(car.Tyre.getFrontWheel());
        rearText.setText(car.Tyre.getRearWheel());
        gNameText.setText(car.Garage.getGarageName());
        gLocText.setText(car.Garage.getGarageLoc());
        gIDText.setText(String.valueOf(car.Garage.getGarageNum()));
        dNameText.setText(car.Driver.getDriverName());
        dTeamText.setText(car.Driver.getDriverTeam());
        dIDText.setText(String.valueOf(car.Driver.getDriverID()));
    }

    @FXML
    @SuppressWarnings("unused")
    private void returnToMain() throws IOException {
        App.setRoot("main_page");
    }

    // @SuppressWarnings("unused")
    // private void submitButton(ActionEvent event){
    //     String enteredText = carBrand.getText();
    // }
}