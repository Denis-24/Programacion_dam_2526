package org.example;

import java.util.Arrays;

public class ejercicio_5_vector {
    static void main() {
        int vector[] = {1,2,3,4,5};
        int aux = 0;

        System.out.println("Vector original: " + Arrays.toString(vector));

        for (int i= vector.length-1;i>=0;i--){

            if (i+1==vector.length){
                aux=vector[i];
                vector[i]=vector[i-1];
            }else if (i< vector.length && i>0){
                vector[i]=vector[i-1];
            }else if (i==0){
                vector[i]=aux;
            }
        }

        System.out.println("Vector  rotado: " + Arrays.toString(vector));
        System.out.println(aux);





    }
}
