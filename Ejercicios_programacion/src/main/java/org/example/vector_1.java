package org.example;

import java.util.Arrays;
import java.util.Random;

public class vector_1 {
    static void main() {

        Random aleatorio = new Random();

        int vector[] = new int[8];
        int suma = 0;

        for (int i=0;i<vector.length;i++){
            vector[i]=aleatorio.nextInt(501);
            suma+=vector[i];
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("la suma total es: " + suma);

    }
}
