package com.challenge.challenge;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("conversor-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 570, 400);
        stage.setTitle("Conversor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void llenarCombo(ComboBox<String> llenarcombo, ObservableList<String> infocombo){
        llenarcombo.setItems(infocombo);


    }
}