package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Matrzes {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = {{0,1,2},{3,4,5},{6,7,8}};

        int matriz2[][] = new int[3][3];

        System.out.println(matriz[1][0]);
        System.out.println(matriz[2][1]);


        for (int x=0;x< matriz.length;x++){
            for (int y=0;y<matriz[0].length;y++){
                System.out.print(matriz[x][y]);
            }
            System.out.println(" ");
        }

        for (int x[] : matriz){
            for (int y : x){
                System.out.print(y);
            }
            System.out.println();
        }

        for (int x[] : matriz){
            System.out.println(Arrays.toString(x));
        }

        int vector[] = {1,2,3,4};

        for (int num : vector){
            System.out.println(num);
        }






    }
}
