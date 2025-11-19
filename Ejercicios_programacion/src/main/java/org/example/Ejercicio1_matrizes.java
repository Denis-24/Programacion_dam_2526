package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1_matrizes {
    static void main() {
        Random aleatorio = new Random();

        int tamanyo = aleatorio.nextInt(6)+2;

        int matriz[][] = new int[tamanyo][tamanyo];

        for (int x=0;x<matriz.length;x++){
            for (int y=0;y<matriz.length;y++){
                matriz[x][y] = aleatorio.nextInt(10);
            }
        }

        for (int x[] : matriz){
            System.out.println(Arrays.toString(x));
        }


        for (int x=0;x<matriz.length;x++){
            for (int y=0;y<matriz[x].length;y++){
                if (x==y){
                    System.out.print(matriz[x][y]);
                }
            }
        }

        System.out.println();

        for (int x=0;x<matriz.length;x++){
            System.out.print(matriz[x][x]);
        }

        System.out.println();

        for (int x = 0; x <matriz.length; x++) {
                System.out.print(matriz[x][matriz.length-1-x]);


        }














    }
}
