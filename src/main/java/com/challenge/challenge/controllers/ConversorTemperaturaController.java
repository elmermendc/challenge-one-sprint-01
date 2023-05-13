package com.challenge.challenge.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.challenge.challenge.MainApplication.llenarCombo;

public class ConversorTemperaturaController{
    public TextField txtValorTemp;
    public ComboBox txtFuenteTemp;
    public ComboBox txtDestinoTemp;
    public Button btnConvertirTemp;
    public Label txtResultadoTemp;
    private Temperatura converter = new Temperatura();
    ObservableList<String> fuenteLista = FXCollections.observableArrayList("CELSIUS", "FAHRENHEIT", "KELVIN");

    public void listarFuenteTemp(Event event) {
        llenarCombo(txtFuenteTemp,fuenteLista);
    }
    public void listarDestinoTemp(Event event) {
        llenarCombo(txtDestinoTemp,fuenteLista);
    }
    public void onBtnConvertirTemp(ActionEvent actionEvent) {
        String valor = txtValorTemp.getText(); // obtener el texto del campo de entrada
        String deTemperatura = (String) txtFuenteTemp.getSelectionModel().getSelectedItem();
        String aTemperatura = (String) txtDestinoTemp.getSelectionModel().getSelectedItem();
        if(!Validador.validarTemperatura(valor)) return;
        if(!Validador.validarComboBox(deTemperatura)) return;
        if(!Validador.validarComboBox(aTemperatura)) return;
        double grados = Double.parseDouble(valor);
        double result = converter.convertir(grados, deTemperatura, aTemperatura);
        txtResultadoTemp.setText(grados+" "+deTemperatura+" = \n"+String.format("%.2f", result)+" "+aTemperatura);

    }

}
