module com.packages {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.packages to javafx.fxml;
    exports com.packages;
    exports com.packages.mainclasses;
}
