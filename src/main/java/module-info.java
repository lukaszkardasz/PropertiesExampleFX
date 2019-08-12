/**
 * @project fxproperties
 * @author n2god on 12/08/2019
 */module fxproperties {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.n2god.fxProperties.main;
    opens pl.n2god.fxProperties.controller to javafx.fxml;
}