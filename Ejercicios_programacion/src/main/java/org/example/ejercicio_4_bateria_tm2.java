package org.example;

import java.util.Scanner;

public class ejercicio_4_bateria_tm2 {

    static void main() {

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int texto_tamaño = texto.length();
        int palabra_tamanyo = palabra.length();


        String frase_sin = texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamaño - conteo;
        int resultado = resta / palabra_tamanyo;
        System.out.println(resultado);


    }
}
