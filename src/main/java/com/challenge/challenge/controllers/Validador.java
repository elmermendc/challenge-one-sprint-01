package com.challenge.challenge.controllers;

import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validador {

    public static boolean validarComboBox(String comboBox) {
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
    public static boolean validarNumero(String numero){
        Pattern pattern = Pattern.compile("^[0-9]+(\\.[0-9]{1,2})?$");
        Matcher matcher = pattern.matcher(numero);
        if (!matcher.matches()) {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("Error en valor");
            dialog.setContentText("Ingrese valor de moneda a convertir");
            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.getDialogPane().getButtonTypes().add(okButton);
            dialog.setResultConverter(dialogButton -> "OK");
            dialog.showAndWait();
            return false;
        }
        return true;

    }
    public static boolean validarTemperatura(String numero){
        Pattern pattern = Pattern.compile("^[-+]?([0-9]+([.][0-9]*)?|[.][0-9]+)$");
        Matcher matcher = pattern.matcher(numero);
        if (!matcher.matches()) {
            Dialog<String> dialog = new Dialog<>();
            dialog.setTitle("Error en valor");
            dialog.setContentText("Ingrese valor de temperatura a convertir");
            ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
            dialog.getDialogPane().getButtonTypes().add(okButton);
            dialog.setResultConverter(dialogButton -> "OK");
            dialog.showAndWait();
            return false;
        }
        return true;

    }
}