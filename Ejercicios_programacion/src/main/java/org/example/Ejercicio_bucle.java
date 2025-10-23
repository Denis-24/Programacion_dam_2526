package org.example;

import java.util.Scanner;

public class Ejercicio_bucle {
    static void main() {
        Scanner tecaldo = new Scanner(System.in);

        do {
            String buena = "admin1234";
            System.out.println("introduce tu contraseña");
            String contraseña = tecaldo.next();

            if (contraseña.equals(buena)){
                break;
            }
        }while(true);

    }
}
