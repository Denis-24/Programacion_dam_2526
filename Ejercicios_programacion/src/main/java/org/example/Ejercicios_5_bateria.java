package org.example;

import java.sql.SQLOutput;
import  java.util.Scanner;

public class Ejercicios_5_bateria {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero...");
        double num1 = teclado.nextDouble();

        System.out.println("Dime otro numero...");
        double num2 = teclado.nextDouble();

        if (num2 == 0) {
            System.out.println("ERROR no se puede dividir entre cero");
        }else {
            double division = num1 / num2;
            System.out.println("La division es: " + division);
        }

    }
}
