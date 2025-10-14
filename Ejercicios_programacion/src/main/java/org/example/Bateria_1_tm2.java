package org.example;

import java.util.Scanner;

public class Bateria_1_tm2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra o una frase");
        String frase = teclado.nextLine();

        System.out.println("Texto original: " + frase);

        int tamaño = frase.length();
        System.out.println("La longitud del texto es de " + tamaño + " caracteres");

        System.out.println("La frase sin es pacios es: " + frase.trim());
    }
}
