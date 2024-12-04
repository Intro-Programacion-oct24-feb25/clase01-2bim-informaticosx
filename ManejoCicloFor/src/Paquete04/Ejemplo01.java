/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete04;

import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       int numero_de_tablas;
       int limite; 
       int contador = 1;
       int inicio = 1;
       
       System.out.print("Ingrese el numero de tablas de multiplicar a crear, desde 1: ");
       numero_de_tablas = entrada.nextInt();
       System.out.print("Ingrese el limite de cada tabla: ");
       limite = entrada.nextInt();
       
       while (inicio<=numero_de_tablas){
           while (contador <= limite) { 
               System.out.println(inicio + "*" + contador + "=" + inicio*contador );
               contador = contador + 1;
           }
           contador = 1;
           inicio = inicio + 1;
       }

       
    }

}
