package com.challenge.challenge.controllers;

import java.math.BigDecimal;

public class Monedas {

    private static final String[] MONEDAS = {"USD", "EUR", "GBP", "PEN"};
    private static final BigDecimal[][] TIPO_CAMBIO = {
            {new BigDecimal("1.0000"), new BigDecimal("0.9154"), new BigDecimal("0.7990"), new BigDecimal("3.6584")},
            {new BigDecimal("1.0921"), new BigDecimal("1.0000"), new BigDecimal("0.8726"), new BigDecimal("3.9959")},
            {new BigDecimal("1.2513"), new BigDecimal("1.1459"), new BigDecimal("1.0000"), new BigDecimal("4.5793")},
            {new BigDecimal("0.2732"), new BigDecimal("0.2501"), new BigDecimal("0.2183"), new BigDecimal("1.0000")}
    };

    public static BigDecimal convert(BigDecimal monto, String deMoneda, String aMoneda) {
        int deIndex = getIndex(deMoneda);
        int aIndex = getIndex(aMoneda);
        if (deIndex == -1 || aIndex == -1) {
            throw new IllegalArgumentException("Moneda Invalida");
        }
        BigDecimal convertir = TIPO_CAMBIO[deIndex][aIndex];
        return monto.multiply(convertir);
    }

    private static int getIndex(String moneda) {
        for (int i = 0; i < MONEDAS.length; i++) {
            if (MONEDAS[i].equals(moneda)) {
                return i;
            }
        }
        return -1;
    }
}
