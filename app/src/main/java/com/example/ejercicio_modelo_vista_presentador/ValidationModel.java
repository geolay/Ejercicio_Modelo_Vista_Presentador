package com.example.ejercicio_modelo_vista_presentador;

public class ValidationModel {
    private int minimun;
    private int medium;
    private int max;

    private String color;
    private String textoColor;

    public String getTextoColor() {
        return textoColor;
    }

    public String valuesLength(String values) {
        if (values.length() < 5) {
            this.textoColor = "débil";
            return "#FF0000";
        } else if (values.length() >= 5) {
            if (values.equals(values.toLowerCase())) {
                this.textoColor = "medio";
                return "#FFFF00";
            } else {
                this.textoColor = "fuerte";
                return "#00FF00";
            }
        }
        else{
            return "";
        }
    }
}
