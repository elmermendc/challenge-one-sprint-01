package com.challenge.challenge.controllers;

public class Temperatura {

    public static double convertir(double cantidad, String desde, String hacia) {
        double resultado = 0;
        switch (desde) {
            case "CELSIUS":
                resultado = celsiusAHacia(cantidad, hacia);
                break;
            case "FAHRENHEIT":
                resultado = fahrenheitAHacia(cantidad, hacia);
                break;
            case "KELVIN":
                resultado = kelvinAHacia(cantidad, hacia);
                break;
        }
        return resultado;
    }

    private static double celsiusAHacia(double cantidad, String hacia) {
        switch (hacia) {
            case "FAHRENHEIT":
                return cantidad * 9 / 5 + 32;
            case "KELVIN":
                return cantidad + 273.15;
            default:
                return cantidad;
        }
    }

    private static double fahrenheitAHacia(double cantidad, String hacia) {
        switch (hacia) {
            case "CELSIUS":
                return (cantidad - 32) * 5 / 9;
            case "KELVIN":
                return (cantidad - 32) * 5 / 9 + 273.15;
            default:
                return cantidad;
        }
    }

    private static double kelvinAHacia(double cantidad, String hacia) {
        switch (hacia) {
            case "CELSIUS":
                return cantidad - 273.15;
            case "FAHRENHEIT":
                return (cantidad - 273.15) * 9 / 5 + 32;
            default:
                return cantidad;
        }
    }
}