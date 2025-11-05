package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercico_3_vectores {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector[] =new int[25];
        int resultado = 0;

        System.out.println("Introduce un numero del 0 al 100...");
        int num = teclado.nextInt();

        for (int i =0;i<vector.length;i++){
            vector[i]=aleatorio.nextInt(101);

            if (vector[i] == num){
                resultado++;
            }

        }

        System.out.println(Arrays.toString(vector));
        System.out.println(resultado);






    }
}
