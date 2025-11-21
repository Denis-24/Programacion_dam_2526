package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class rellenar_matriz {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        String nombres[][] = new String[2][3];


        for (int x = 0; x < nombres.length; x++) {

            String fila[]=teclado.next().split("-");

            if (fila.length==nombres[x].length){
                for (int y = 0; y < nombres[x].length; y++) {
                    nombres[x][y]=fila[y];
                }
            }else{
                System.out.println("El tamaño no es el adecuado...");
                x--;
            }
        }

        for (String x[] : nombres){
            System.out.println(Arrays.toString(x));
        }























    }
}
