module fxProperties {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.n2god.fxProperties.main;
    opens pl.n2god.fxProperties.controller to javafx.fxml;
}