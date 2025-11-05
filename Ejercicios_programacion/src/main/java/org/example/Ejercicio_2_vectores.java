package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_2_vectores {
    static void main() {
        Random aleatorio = new Random();

        int vector[] = {1,4,6,3,9};
        int aux=0;


        for (int i=0;i<vector.length/2;i++){
            aux=vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;

        }
        System.out.println(Arrays.toString(vector));
    }
}
