package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_4_bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un primer numero...");
        int num1 = teclado.nextInt();

        System.out.println("Dime un segundo numero...");
        int num2 = teclado.nextInt();

        System.out.println("Dime un tercer numero...");
        int num3 = teclado.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("No se pueden poner numeros iguales.");

        }
        else {
            int menor = 0;
            if (num2 > num1 && num1 < num3) {
                menor = num1;

            }
            if (num1 > num2 && num2 < num3) {
                menor = num2;

            }
            if (num1 > num3 && num3 < num2) {
                menor = num3;

            }
            System.out.println("El numero minimo es " + menor);
        }

    }
}
