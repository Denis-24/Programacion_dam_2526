package org.example;

import java.util.Scanner;

public class Matrices_tabla {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("cuantos alumnos tienes...");
        int alumnos = teclado.nextInt();

        System.out.println("Cuantas asignaturas cursas...");
        int asignaturas = teclado.nextInt();

        teclado.nextLine();

        String notas[][] = new String[alumnos+1][asignaturas+1];

        notas[0][0] = "Estudiantes";

        for (int x = 1; x < notas.length; x++) {
            System.out.println("Introduce el nombre del estudante " + x);
            notas[x][0] = teclado.next();
        }

        for (int x = 1; x < notas[0].length; x++) {
            System.out.println("Introduce la asignaturas " + x);
            notas[0][x] = teclado.next();
        }

        for (int x = 1; x < notas.length; x++) {
            for (int y = 1; y < notas[x].length; y++) {

                System.out.println("Introduce la nota de " + notas[x][0] + " para la asigantura de " + notas[0][y]);
                notas[x][y] = teclado.next();
            }

        }







        for (String x[] : notas){
            for (String num : x){
                System.out.print(num + " ");
            }
            System.out.println();
        }












    }
}
