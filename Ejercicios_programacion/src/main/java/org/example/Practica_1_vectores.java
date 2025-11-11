package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica_1_vectores {
    static void main() {
        Random aleatorio = new Random();

        Scanner teclado = new Scanner(System.in);

        int vector_ejemplo[] = {1,2,3,4,5,6,7};
        int tamanyo_max = vector_ejemplo.length;
        int start = aleatorio.nextInt(0,8);
        int victorias_equipo_1 = 0;
        int victorias_equipo_2 = 0;
        int muerte_1 =0;
        int muerte_2=0;

        int vector1_int[] = {1,2,3,4,5,6,7};
        int vector2_int[] = {1,2,3,4,5,6,7};


        System.out.println("> Equipo 1");
        System.out.println(">Introduce potencia de los samurais: ");
        String potencias1 = teclado.nextLine();
        System.out.println(">Eqipo completado");

        String vector1[] = potencias1.split(" ");

        System.out.println(vector1.length);

        System.out.println("-----------------------");

        System.out.println("> Equipo 2");
        System.out.println(">Introduce potencia de los samurais: ");
        String potencias2 = teclado.nextLine();
        System.out.println(">Eqipo completado");

        String vector2[] = potencias2.split(" ");


        for (int i=0; i<vector1.length;i++){
            vector1_int[i] = Integer.parseInt(vector1[i]);
            vector2_int[i] = Integer.parseInt(vector2[i]);
        }

        System.out.println("!EMPIEZA LA BATALLA!");

        System.out.println("La batalla inicia con el samurai " + (start +1));

        for (int i=start,j=0;i<=tamanyo_max;i++,j++){
            if (i!=tamanyo_max){
                if (vector1_int[i] > vector2_int[i]){
                    System.out.println("Samurai " + (i+1) + ". Gana Equpo 1. " + vector1_int[i] + " vs " + vector2_int[i]);
                    victorias_equipo_1++;
                    muerte_2++;
                } else if (vector1_int[i] < vector2_int[i]) {
                    System.out.println("Samurai " + (i+1) + ". Gana Equipo 2. " + vector1_int[i] + " vs " + vector2_int[i]);
                    victorias_equipo_2++;
                    muerte_1++;
                }else{
                    System.out.println("Samurai " + (i+1) + ". Es un empate. " + vector1_int[i] + " vs " + vector2_int[i]);
                }
                if (j==6){
                    break;
                }
            } else if (i==tamanyo_max) {
                i=0;
                if (vector1_int[i] > vector2_int[i]){
                    System.out.println("Samurai " + (i+1) + ". Gana Equpo 1. " + vector1_int[i] + " vs " + vector2_int[i]);
                    victorias_equipo_1++;
                    muerte_2++;
                } else if (vector1_int[i] < vector2_int[i]) {
                    System.out.println("Samurai " + (i+1) + ". Gana Equipo 2. " + vector1_int[i] + " vs " + vector2_int[i]);
                    victorias_equipo_2++;
                    muerte_1++;
                }else{
                    System.out.println("Samurai " + (i+1) + ". Es un empate. " + vector1_int[i] + " vs " + vector2_int[i]);
                }
                if (j==6){
                    break;
                }

            }

        }

        if (victorias_equipo_1>victorias_equipo_2){
            System.out.println("El eqipo 1 ha gando. El quepio 2 ha tenido " + muerte_2 + " muertes");
        } else if (victorias_equipo_1<victorias_equipo_2) {
            System.out.println("El equipo 2 ha ganado. El quepio 1 ha tenido " + muerte_1 + " muertes");
        }else{
            System.out.println("No hay ganadores, es un empate.");
        }

        //1 2 3 4 5 6 7
        //7 6 5 4 3 2 1


    }
}
