package com.challenge.challenge.controllers;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;


public class Validador {

    public boolean validarComboBox(String comboBox) {
        if (comboBox==null) {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("Error en la selección");
            dialog.setContentText("Por favor, seleccione un elemento de la lista");
            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.getDialogPane().getButtonTypes().add(okButton);
            dialog.showAndWait();
            return false;
        }
        return true;
    }
}