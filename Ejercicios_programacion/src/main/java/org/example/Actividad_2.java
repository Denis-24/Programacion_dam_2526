package org.example;

import java.util.Scanner;

public class Actividad_2 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = teclado.nextLine();

        System.out.println("¿A que curso vas?");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + " bienvenid@ al curso " + curso);

        System.out.println("Dime un número...");
        int num1 = teclado.nextInt();

        System.out.println("Dime otro número...");
        int num2 = teclado.nextInt();

        // opcion 1
        System.out.println("El resultado es " + (num1+num2));

        // opcion 2
        int resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
    }
}
