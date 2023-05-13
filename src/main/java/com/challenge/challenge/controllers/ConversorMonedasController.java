package com.challenge.challenge.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.challenge.challenge.MainApplication.llenarCombo;

public class ConversorMonedasController{

    public TextField txtValor;
    public ComboBox txtFuente;
    public ComboBox txtDestino;
    public Button btnConvertir;
    public Label txtResultado;
    private Monedas converter = new Monedas();
    ObservableList<String> fuenteLista = FXCollections.observableArrayList("PEN - Soles Peruanos","USD - Dolares Americanos", "EUR - Euros", "GBP - Libras Esterlinas");

    public void listarFuente(Event event) {
        llenarCombo(txtFuente,fuenteLista);
    }
    public void listarDestino(Event event) {
        llenarCombo(txtDestino,fuenteLista);
    }

    public void onBtnConvertir(ActionEvent actionEvent) {
        String numero = txtValor.getText(); // obtener el texto del campo de entrada
        String deTipoMoneda = (String) txtFuente.getSelectionModel().getSelectedItem();
        String aTipoMoneda = (String) txtDestino.getSelectionModel().getSelectedItem();

        if(!Validador.validarNumero(numero)) return;
        if(!Validador.validarComboBox(deTipoMoneda)) return;
        if(!Validador.validarComboBox(aTipoMoneda)) return;

        String deMoneda = deTipoMoneda.substring(0, deTipoMoneda.indexOf(" "));
        String aMoneda = aTipoMoneda.substring(0, aTipoMoneda.indexOf(" "));
        String fuenteMoneda = deTipoMoneda.substring(deTipoMoneda.indexOf("-") + 1);
        String destinoMoneda = aTipoMoneda.substring(aTipoMoneda.indexOf("-") + 1);

        BigDecimal monto = new BigDecimal(numero);
        BigDecimal result = converter.convert(monto, deMoneda, aMoneda);
        txtResultado.setText(numero+fuenteMoneda+" = \n"+result.toString()+ destinoMoneda);
    }




}



