package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_4_vector {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int vector[] = {1,4,6,3,9};
        int tamanyo =0;

        System.out.println(Arrays.toString(vector));
        System.out.println("dime que indeice eliminar...");
        int eliminar = teclado.nextInt();

        for (int i=eliminar;i<vector.length;i++){
            if (i<vector.length-1){
                vector[i]=vector[i+1];
            }
        }
        int vector2[] = vector.length-2;
        tamanyo = vector.length;
        System.out.println(Arrays.toString(vector));
    }
}
