package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ruelta {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final String COLORES[] = {"rojo","negro"};
        String color_apuesta = "";
        String par_impar_apuesta = "";

        Integer numeros[] = new Integer[37];

        for (int i=0;i<numeros.length;i++) {
            numeros[i]=i;
        }

        final String PAR_IMPAR[] = {"par","impar"};

        System.out.println("Introduce tu numero de apuesta (0-36):");
        int num_apuesta = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(num_apuesta)) {
            System.out.println("ERROR. El número no es válido (0-36)");
            return;
        }

        if (num_apuesta != 0) {
            System.out.println("Introduce el color de tu apuesta (rojo-negro):");
            color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)) {
                System.out.println("ERROR. El color introducido no es válido (rojo-negro)");
                return;
            }

            System.out.println("Introduce apuesta (par-impar):");
            par_impar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)) {
                System.out.println("ERROR. La apuesta introducida no es válida (par-impar))");
                return;
            }


        }

        String color_sorteo = COLORES[aleatorio.nextInt(2)]; //colores[0] a colores[1]
        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String par_impar_sorteo = "";
        if (numero_sorteo % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_sorteo== num_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)) {
            System.out.println("HAS GANADO!!");
        } else if (numero_sorteo== num_apuesta) {
            System.out.println("Ha acertado el número");
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acertado el color " + color_apuesta);
        } else if (par_impar_sorteo.equals(par_impar_apuesta)) {
            System.out.println("Has acertado " + par_impar_apuesta);
        } else {
            System.out.println("Has perdido");
        }
    }
}
