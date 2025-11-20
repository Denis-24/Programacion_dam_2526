package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_creada_usuario {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        int matriz[][] = new int[3][3];


        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                System.out.println("Introduce un numero... " + contador);
                contador++;
                int num= teclado.nextInt();
                matriz[x][y] = num;
            }
        }

        for (int x[] : matriz){
            System.out.println(Arrays.toString(x));
        }

        System.out.println("Dime un numero...");
        int acertar = teclado.nextInt();

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (acertar==matriz[x][y]){
                    System.out.println("El numero " + acertar + " se encuentra en la posicion " + x + " y " + y );
                }
            }
        }



    }
}
