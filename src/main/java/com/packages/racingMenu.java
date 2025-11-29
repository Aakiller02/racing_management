package com.packages;

import java.io.IOException;
import javafx.fxml.FXML;

public class racingMenu {

    @FXML
    @SuppressWarnings("unused")
    private void returnToMain() throws IOException {
        App.setRoot("main_page");
    }
}