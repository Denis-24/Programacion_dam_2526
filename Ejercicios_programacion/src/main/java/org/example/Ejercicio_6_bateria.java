package org.example;

import java.util.Scanner;

public class Ejercicio_6_bateria {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int base;

        do {
            System.out.println("Valor de la base");
            base = teclado.nextInt();

            if (base < 0) {
                System.out.println("El valor de la base tiene que ser positivo");
            }
        }while (base < 0);

        int altura;

        do {
            System.out.println("Valor de la altura");
            altura = teclado.nextInt();

            if (altura < 0) {
                System.out.println("El valor de la altura tiene que ser positivo");
            }
        }while (altura < 0);

        int area = base * altura;
        System.out.println("El area del triangulo es: " + area);
    }
}
