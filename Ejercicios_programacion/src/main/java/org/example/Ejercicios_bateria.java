package org.example;

import java.util.Scanner;
public class Ejercicios_bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuantas horas trabajas a la semana...");
        int horas = teclado.nextInt();

        System.out.println("Dime cual es tu tarifa por hora...");
        int tarifa = teclado.nextInt();

        if (horas > 40) {
            int horas_normal = 40;
            int horas_extra = horas - 40;
            int sueldo = (int) ((horas_extra * (tarifa * 1.5)) + (horas_normal * tarifa));
            System.out.println("Tu sueldo con las horas extra multiplicando tu tarifa por 1.5 es de: " + sueldo + " euros");

        }

        if (horas <= 40) {
            int sueldo = horas * tarifa;
            System.out.println("Tu sueldo es de " + sueldo + " euros");
        }
    }

}