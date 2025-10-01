package org.example;

import java.util.Scanner;

public class La_Patriferia {
    static void main() {
        //Pongo los requisitos para poder subirse a las atraciones.
        Scanner teclado = new Scanner(System.in);
        final int ALTURA_MINIMA = 140;
        final int ALTURA_MAXIMA = 230;
        final int PESO_MAXIMO = 120;
        //Damos la bienvenida antes e ejecutar cualquier cosa.
        System.out.println("!BIENVENIDOS A LA PATRILANDIA");
        //
        int altura = 0;
        boolean control = false;
        do {
            try {
                System.out.println("Introduce cuanto mides (cm)...");
                altura = teclado.nextInt();
                control = true;
            }catch (Exception e){
                System.out.println("SOLO PUEDES INTRODUCIR NUMEROS POSITIVOS...");
                teclado.nextLine();
            }
        }while (control == false);

        if (altura < ALTURA_MINIMA) {
            System.out.println("LO SIENTO NO TE PUEDES SUBIR. TE FALTAN " + (ALTURA_MINIMA - altura) + "cm");
        }else if (altura > ALTURA_MAXIMA){
            System.out.println("ERROR DE LECTURA. PORFAVOR VUELVE A SUBIR A LA BASCULA");

        }else {
            int peso = 0;
            do {
                try {
                    System.out.println("Introduce tu peso (kg)...");
                    peso = teclado.nextInt();
                    control = true;
                }catch (Exception e){
                    System.out.println("DEBES INTRODUCIR NUMEROS POSITIVOS...");
                    teclado.nextLine();
                }
            }while (control == false);

            int peso_min = altura * 2 / 8;

            if (peso > PESO_MAXIMO){
                System.out.println("LO SIENTO. Sobrepasas " + (PESO_MAXIMO - peso) + " kg");
            }else if (peso < peso_min){
                System.out.println("LO SIENTO. TE FALTAN " + (peso_min - peso) + " kg");
            }else {
                System.out.println("PESAS " + peso + " kg. PESO MINIMO CALCULADO: " + peso_min + " kg.");
            }
        }

    }

}
