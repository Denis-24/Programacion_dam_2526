package org.example;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);


        String matriz[][] = new String[3][3];
        String formato = "\\d{1,2}-\\d{1,2}-\\d{1,2}";
        String filas[] = new String[3];
        String bolas[] = new String[25];

        for (int i = 0; i < bolas.length; i++) {
            bolas[i] = String.valueOf(aleatorio.nextInt(1,91));
        }

        System.out.println("Introduce tu carton por filas...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Fila " + (i+1) + ":");
            filas = teclado.next().split("-");
            matriz[i]= filas;
            for (String silaba : filas){
                matriz[i]= filas;
            }
        }

        System.out.println("Datos del carton introducidos:");

        for (String linea[] : matriz){
            for (String num : linea){
                System.out.print(num + " ");
            }
            System.out.println();
        }

























    }
}
