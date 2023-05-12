package com.challenge.challenge.controllers;

import com.challenge.challenge.MainApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ConversorController {

    Stage monedasStage = new Stage();
    public void callMonedas(MouseEvent mouseEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("conversor-monedas-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 570, 400);
            monedasStage.setTitle("Conversor de Monedas");
            monedasStage.setScene(scene);
            monedasStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void callTemperatura(MouseEvent mouseEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("conversor-temperatura-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 570, 400);
            monedasStage.setTitle("Conversor de Temperatura");
            monedasStage.setScene(scene);
            monedasStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}