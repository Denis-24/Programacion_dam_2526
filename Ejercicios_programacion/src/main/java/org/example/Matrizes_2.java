package org.example;

import java.util.Arrays;
import java.util.Random;

public class Matrizes_2 {
    static void main() {

        Random aleatorio = new Random();


        int matriz[][] = new int[aleatorio.nextInt(6)+2][aleatorio.nextInt(6)+2];

        for (int x=0;x< matriz.length;x++){
            for (int y=0;y<matriz[x].length;y++){

                matriz[x][y] = aleatorio.nextInt(11);

            }
        }




        for (int x[] : matriz){

            System.out.println(Arrays.toString(x));

        }
















    }
}
