package org.example;

import java.util.Scanner;
public class Ejecicios_1_bateria {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas horas trabajas");
        int horas = teclado.nextInt();

        System.out.println("Dime tu tarifa de hora");
        int tarifa = teclado.nextInt();

        int sueldo = horas * tarifa;

        System.out.println("Tu salario es de " + sueldo + "Euros");
    }

}
