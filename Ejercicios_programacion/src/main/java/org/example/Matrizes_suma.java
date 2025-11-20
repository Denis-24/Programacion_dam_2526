package org.example;

import java.util.Random;

public class Matrizes_suma {
    static void main() {

        Random aleatorio = new Random();


        int matriz[][] = new int[aleatorio.nextInt(1,6)][aleatorio.nextInt(1,6)];
        int suma_x=0;
        int suma_y=0;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = aleatorio.nextInt(10);

            }

        }

        for (int x[] : matriz){
            for (int num : x){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Suma de filas:");
        for (int x = 0; x < matriz.length; x++) {
            suma_x=0;
            for (int y = 0; y < matriz[x].length; y++) {

                suma_x += matriz[x][y];

            }
            System.out.println("Fila " + (x+1) + ": " + suma_x);
        }

        System.out.println();

        System.out.println("Suma de columnas");

        for (int x = 0; x < matriz[0].length; x++) {
            suma_x=0;
            for (int y = 0; y < matriz.length; y++) {

                suma_x += matriz[y][x];

            }
            System.out.println("Columna: " + (x+1) + ": " + suma_x);
        }














    }
}
