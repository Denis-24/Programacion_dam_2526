package org.example;

import java.util.Scanner;

public class Ejercicio_2_Bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuantas horas a la semana trabjas...");
        int horas = teclado.nextInt();

        System.out.println("Dime cual es tu tarifa por hora...");
        int tarifa = teclado.nextInt();

        int sueldo = horas * tarifa;
        System.out.println("Tu sueldo a la semana es de " + sueldo + " euros");

    }
}
