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
    SportCar car = App.getCurrentCar();

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        brandText.setText(car.getBrand());
        modelText.setText(car.getModel());
        engineText.setText(car.engineType());
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