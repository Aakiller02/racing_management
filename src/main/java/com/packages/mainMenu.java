package com.packages;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class mainMenu {

    @FXML
    @SuppressWarnings("unused")
    private void switchToRaceManagementPage() throws IOException {
        App.setRoot("race_management_page_2");
    }

    @FXML
    @SuppressWarnings("unused")
    private void exit(ActionEvent event){
        Platform.exit();
    }
}
