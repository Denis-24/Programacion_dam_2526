package org.example;

 import java.util.Scanner;

public class Ejercicios_3_bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero...");
        int num = teclado.nextInt();

        if (num == 0) {
            System.out.println("tu numero es neutro");

        }else {
            if (num < 0 ) {
                System.out.println("Tu numero es negativo");
            }else {
                    System.out.println("Tu numero es positivo");
            }
        }
    }
}
