package com.example.ejercicio_modelo_vista_presentador;

public class Presentador {
    private ValidationModel validationModel;
    private IPresentador iPresentador;

    public Presentador(IPresentador iPresentador) {
        this.validationModel = new ValidationModel();
        this.iPresentador = iPresentador;
    }

    public void levelSecurity(String password){
        validationModel.valuesLength(password);
        validationModel.getTextoColor();


    }
}
