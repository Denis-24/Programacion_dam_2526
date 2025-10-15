package org.example;

import java.util.Scanner;

public class ejercicio_3_batera_tm2 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta un numero...");
        int numero = teclado.nextInt();

        System.out.println("Cuantas cifras quieres eliminar?");
        int eliminar = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tamaño = numero_string.length();
        int nuevo_tamaño = tamaño - eliminar;

        String resultado = numero_string.substring(0,nuevo_tamaño);
        System.out.println("Resultado es " + resultado);

    }
}
