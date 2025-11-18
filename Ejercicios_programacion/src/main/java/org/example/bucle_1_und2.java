package org.example;

import java.util.Scanner;

public class bucle_1_und2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la altura de tu torre...");
        int altura = teclado.nextInt();

        externa:
        for (int i=1;i<=altura;i++){
            for (int j=1;j<=i;j++){

                System.out.print("*");

            }
            System.out.println();
        }







    }
}
