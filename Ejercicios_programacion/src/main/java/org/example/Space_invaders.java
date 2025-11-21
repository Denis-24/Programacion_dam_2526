package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Space_invaders {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce numero de filas...");
        int filas = teclado.nextInt();

        teclado.nextLine();

        String matriz[][] = new String[filas][3];

        for (int x = 0; x < matriz.length; x++) {

            String fila[] = teclado.next().split("");

            if (fila.length== matriz[x].length){
                for (int y = 0; y < matriz[x].length; y++) {
                    matriz[x][y]=fila[y];
                }
            }else{
                System.out.println("Longitud introducida incorrecta");
                x--;
            }
        }

        for (String fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int y = 0; y < matriz[0].length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                System.out.print(matriz[x][y]);
            }
        }


















    }
}
