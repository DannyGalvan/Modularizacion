/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.modularizacion;

import java.util.Scanner;

/**
 *
 * @author cgalv
 */
public class Modularizacion {

    public static void main(String[] args) {
        int operacion;
        float res,operandoUno,operandoDos;
        
        operacion = 0;
        res = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.print("Ingrese la operación que desea realizar: ");
        operacion = scan.nextInt();
        
        System.out.print("Ingrese el primero operando: ");
        operandoUno = scan.nextFloat();
        
        System.out.print("Ingrese el segundo operando: ");
        operandoDos = scan.nextFloat();
        
     
        
        switch (operacion) {
            case 1: res = suma(operandoUno,operandoDos);
                    break;
            case 2: res = resta(operandoUno,operandoDos);
                    break;
            case 3: res = multiplicacion(operandoUno,operandoDos);
                    break;
            case 4: res = division(operandoUno,operandoDos);
                    break;
        }
        
        System.out.print("El resultado de su operacion es: " + res);
    }
    
    //Aquí creamos los nuevos métodos
    public static float suma(float operandoUno, float operandoDos) {
        float  resultado;     
               
        resultado = operandoUno + operandoDos;
        
        return resultado;
    }
    
    public static float resta(float operandoUno, float operandoDos) {
        float  resultado;    
        
        resultado = operandoUno - operandoDos;
        
        return resultado;
    }
    
     public static float multiplicacion(float operandoUno, float operandoDos) {
         float  resultado;           
        
        resultado = operandoUno * operandoDos;
        
        return resultado;
    }
     
      public static float division(float operandoUno, float operandoDos) {
         float  resultado;           
        
        resultado = operandoUno / operandoDos;
        
        return resultado;
    }
}
