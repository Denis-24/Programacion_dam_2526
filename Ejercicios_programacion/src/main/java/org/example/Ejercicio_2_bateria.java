package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_2_bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuantas horas trabajas a la semana...");
        double horas = teclado.nextDouble();

        System.out.println("Dime cual es tu tarifa por hora...");
        double tarifa = teclado.nextDouble();


        if (horas > 40) {
            double horas_normal = 40;
            double horas_extra = horas - 40;
            double sueldo = ((horas_extra * (tarifa * 1.5)) + (horas_normal * tarifa));
            System.out.println("Tu sueldo con las horas extra multiplicando tu tarifa por 1.5 es de: " + sueldo + " euros"); }

        else {
            double sueldo = horas * tarifa;
        System.out.println("Tu sueldo es de " + sueldo + " euros");}

    }
}