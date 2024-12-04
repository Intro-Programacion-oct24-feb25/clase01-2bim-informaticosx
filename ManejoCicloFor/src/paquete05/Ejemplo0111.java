/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.Scanner;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo0111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numdetablas;
        int inicioTa = 1;
        int limite;
        int contador = 1;

        System.out.println("Ingrese una tabla");
        numdetablas = entrada.nextInt();
        System.out.println("Ingrese un limite");
        limite = entrada.nextInt();
        while (inicioTa <= numdetablas) {

            while (contador <= limite) {
                System.out.println(inicioTa + "*" + contador + "="
                        +inicioTa*contador);
            contador = contador + 1;

            }
           contador = 1;
           inicioTa = inicioTa + 1;
        }

    }

}
//scape: wq para salir de una ventana emergente del git pull 
