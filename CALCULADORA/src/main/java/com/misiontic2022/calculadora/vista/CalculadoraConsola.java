package com.misiontic2022.calculadora.vista;

//https://docs.google.com/document/d/1UzA8qkuNeUYE7eFfYLUliGJW53NXB1ksS0x-Mb6jWug/edit

import com.misiontic2022.calculadora.controlador.CalculadoraController;
import com.misiontic2022.calculadora.controlador.Operacion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;


public class CalculadoraConsola implements CalculadoraVista{
    private CalculadoraController controller;
    private String numeroUno;
    private String numeroDos;
    
    private void menuPrincipal(){
        try(var input=new BufferedReader(new InputStreamReader(System.in)))
        {
         var mainLoop=true;
         while(mainLoop){
             System.out.println("CALCULADORA MANUAL ");
             System.out.println("Puede realizar operaciones matematicas");
             System.out.println("'+': Suma");
             System.out.println("'-': Resta");
             System.out.println("'*': Multiplicacion");
             System.out.println("'/': Division");
             System.out.println("'%': Modulo");
             System.out.println("'.': Salir");
             System.out.println("Por favor seleccione el simbolo de la operacion a ejecutar");
             
             var opcion = input.readLine();
             switch (opcion) {
                 case "+":
                     controller.setOperacion(Operacion.SUMA);
                     break;
                 case "-":
                     controller.setOperacion(Operacion.RESTA);
                     break;  
                 case "*":
                     controller.setOperacion(Operacion.MULTIPLICACION);
                     break;
                 case "/":
                     controller.setOperacion(Operacion.DIVISION);
                     break;
                 case "%":
                     controller.setOperacion(Operacion.MODULO);
                     break;
                 case ".":
                     System.out.println("Hasta la vista Baby");
                     mainLoop=false;
                     continue;
                 default:
                     System.err.println("La opcion" + opcion + " no es valida");
                     System.out.println("Presione 'Enter' para continuar");
                     input.readLine();
                     continue;
                 }
                 System.out.println("Ingrese el primer numero: ");
                 numeroUno=input.readLine();
                 System.out.println("Ingrese el segundo numero ");
                 numeroDos=input.readLine();
                 controller.actionPerformed(null);
                 System.out.println("Presione ENTER para continuar");
                 input.readLine();
                 
            }
        }
        catch(Exception e){
            System.out.println("Error en el sistema, lo SENTIMOS!!"+ e.getMessage());
        }
    }

    @Override
    public String getNumeroUno() {
        return numeroUno;
    }

    @Override
    public String getNumeroDos() {
        return numeroDos;
    }
    
    @Override
   public void setResultado(String resultado){
       System.out.println("El resultado es: "+ resultado);
   }
    @Override
   public void iniciar(CalculadoraController controller){
       this.controller = controller;
       menuPrincipal();
   }
    @Override
   public void mostrarException(Exception ex){
       System.err.println("Exception: "+ ex.getMessage());
   }

    
}
