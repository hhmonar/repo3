package com.misiontic2022.calculador;

import com.misiontic2022.calculadora.controlador.CalculadoraController;
import com.misiontic2022.calculadora.modelo.CalculadoraModelo;
import com.misiontic2022.calculadora.vista.CalculadoraConsola;
import com.misiontic2022.calculadora.vista.CalculadoraVista;

public class App {
    
    
    private enum TipoVista{
        
        SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO, CONSOLA
    
    }
    
    public static void main(String[] args) {
        var tipo = TipoVista.CONSOLA;
        CalculadoraVista view = null;
        switch(tipo){
            case CONSOLA:
                view= new CalculadoraConsola();
                break;
        }
     var model = new CalculadoraModelo();
     var controller = new CalculadoraController(view, model);
     controller.iniciar();
                
    }
     
}
