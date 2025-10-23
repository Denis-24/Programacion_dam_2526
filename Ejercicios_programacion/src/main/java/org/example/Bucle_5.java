package org.example;

import java.util.Scanner;

public class Bucle_5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num = teclado.nextInt();

        for (int i=0;i<=10;i++){
            int resultado = num * i;
            System.out.println(resultado);
        }
    }
}
