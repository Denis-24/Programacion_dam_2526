package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2_matrizes {
    static void main() {

        Random aleatorio = new Random();

        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int m[][] = new int[3][3];

        for (int x = 0; x< matriz.length; x++){
            for (int y = 0; y< matriz.length; y++){
                matriz[x][y]= aleatorio.nextInt(10);
                matriz2[x][y]= aleatorio.nextInt(10);
            }
        }

        for (int x[] : matriz){
            System.out.println(Arrays.toString(x));
        }

        System.out.println();

        for (int x[] : matriz2){
            System.out.println(Arrays.toString(x));
        }

        System.out.println();

        for (int x = 0; x< matriz.length; x++){
            for (int y = 0; y< matriz.length; y++){
                if (matriz[x][y]>matriz2[x][y]){
                    m[x][y]=matriz[x][y];
                }else{
                    m[x][y]=matriz2[x][y];
                }
            }
        }

        for (int x[] : m){
            System.out.println(Arrays.toString(x));
        }



















    }
}
