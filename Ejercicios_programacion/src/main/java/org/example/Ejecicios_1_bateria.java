package org.example;

import java.util.Scanner;
public class Ejecicios_1_bateria {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas horas trabajas");
        String horas = teclado.next();

        System.out.println("Dime tu tarifa de hora");
        String tarifa = teclado.next();

        long sueldo = horas * tarifa;

        System.out.println("Tu salario es de " + sueldo + "Euros");
    }

}
