package pl.n2god.fxProperties.main;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * @author n2god on 12/08/2019
 * @project fxproperties
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();
        second.bind(first);
        second.addListener(((observableValue, oldValue, newValue) -> System.out.println("Zmiana w second: " + newValue)));

        System.out.println("Podaj pierwszą liczbę całkowitą");
        first.set(sc.nextInt());
        sc.nextLine();

        System.out.println("Podaj drugą liczbę całkowitą");
        first.set(sc.nextInt());
        sc.nextLine();

        sc.close();
    }


}
