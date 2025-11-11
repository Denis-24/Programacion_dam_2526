package org.example;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class AsList {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir...");
        String palabra = teclado.next();
        String letras_vector[] = palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir...");
        String cantidad = teclado.nextLine();
        String cantidad_vecotr[] = cantidad.split("");

        if (letras_vector.length == cantidad_vecotr.length){
            for (int i=0;i< letras_vector.length;i++){

                for (int j=0;j<Integer.parseInt(cantidad_vecotr[i]);j++){

                }
            }
        }






    }
}
