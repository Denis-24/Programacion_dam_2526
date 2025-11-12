package org.example;

import java.util.Arrays;

public class Burbuja_descendente {
    static void main() {
        int aux;
        int vector[] = {0,7,4,6,3,2,5,1};
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                //El valor máximo lo más a la derecha posible
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vector));
    }
}
