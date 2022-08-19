package com.misiontic2022.calculadora.vista;

import com.misiontic2022.calculadora.controlador.CalculadoraController;


public interface CalculadoraVista {
    public String getNumeroUno();
    public String getNumeroDos();
    public void setResultado(String resultado);
    public void iniciar(CalculadoraController controller);
    public void mostrarException(Exception ex);

}
