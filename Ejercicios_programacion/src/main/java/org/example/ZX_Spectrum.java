package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ZX_Spectrum {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int alto=0;
        int ancho=0;

        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolucion de tu pantalla (ancho x alto)...");

        do {
            System.out.println("Ancho:");
            ancho = teclado.nextInt();
            System.out.println("Alto");
            alto = teclado.nextInt();

        }while(ancho % 8 ==1 || alto % 8 == 1 || alto>48 || ancho>48);

        String matriz[][] = new String[alto][ancho];

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada pixel:");
        for (int x = 0; x < matriz.length; x++) {
            String linea[] = teclado.next().split("");
            matriz[x]=linea;
        }

        for (String x[] : matriz){
            for (String letra : x){
                System.out.print(letra + " ");
            }
            System.out.println();
        }



























    }
}
