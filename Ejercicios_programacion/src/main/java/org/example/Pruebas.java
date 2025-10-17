package org.example;

import java.util.Scanner;

public class Pruebas {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        if (teclado.hasNextInt()){
            int numero = teclado.nextInt();
            System.out.println(numero);

        }else{
            System.out.println("Formato incorrecto. No es un numero");
        }
    }
}
