package pl.n2god.fxProperties.controller;

import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumeController {

    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    public void initialize() {
        StringBinding volumeSliderBinding = volumeSlider.valueProperty().asString();
        volumeLevelLabel.textProperty().bind(volumeSliderBinding);
        //lub
        //volumeLevelLabel.textProperty().bind(volumeSlider.valueProperty().asString());

        volumeSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            double value = (Double) newValue;
            if (value > 75){
                System.out.println("Za głośno!");
            } else if (value < 25){
                System.out.println("Nic nie słychać!");
            }
        });

    }
}

