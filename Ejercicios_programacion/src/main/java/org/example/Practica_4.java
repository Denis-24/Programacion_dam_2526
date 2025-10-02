package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practica_4 {
    static void main() {
        int numero = 435;

        String numero_string = Integer.toString(numero);

        String numero_medio = numero_string.substring(1,2);

        int numero_medi_int = Integer.parseInt(numero_medio);

        System.out.println("resultado: " + numero_medi_int*numero);

    }

}
