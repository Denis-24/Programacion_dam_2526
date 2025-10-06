package org.example;

import java.util.Scanner;

public class Practica_examen {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double tri_1 = 0;
        boolean control = false;

        do {
            try {
                System.out.println("Introduce la nota del primer trimestre...");
                tri_1 = teclado.nextDouble();
                control = true;

            } catch (Exception e) {
                System.out.println("Solo puedes introducir numeros.");
                teclado.nextLine();
            }
            if (tri_1 < 0) {
                System.out.println("Solo puedes introducir numeros positivos.");
                control = false;
            }
        } while (control == false);

        control = false;
        double tri_2 = 0;

        do {
            try {
                System.out.println("Introduce la nota del segundo trimestre...");
                tri_2 = teclado.nextDouble();
                control = true;

            } catch (Exception e) {
                System.out.println("Solo puedes introducir numeros.");
                teclado.nextLine();
            }
            if (tri_2 < 0) {
                System.out.println("Solo puedes introducir numeros positivos.");
                control = false;

            }
        } while (control == false);

        control = false;
        double tri_3 = 0;

        do {
            try {
                System.out.println("Introduce la nota del tercer trimestre...");
                tri_3 = teclado.nextDouble();
                control = true;

            } catch (Exception e) {
                System.out.println("Solo puedes introducir numeros.");
                teclado.nextLine();
            }
            if (tri_3 < 0) {
                System.out.println("Solo puedes introducir numeros positivos.");
                control = false;

            }
        } while (control == false);

        double suma = tri_1 + tri_2 + tri_3;
        double media = suma / 3;

        System.out.println("La nota media de los tres trimestres es de: " + media);

        if (media >= 5) {
            System.out.println("!Enhorabuena por aprobar!");

        } else {
            System.out.println("!Casi, la proxima vez seguro que apruebas!");
        }
    }
}