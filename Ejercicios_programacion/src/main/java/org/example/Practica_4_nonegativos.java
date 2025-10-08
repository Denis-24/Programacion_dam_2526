package org.example;

import java.util.Scanner;

public class Practica_4_nonegativos {
    static void main() {
        //esto es para poder escribir con el teclado.
        Scanner teclado = new Scanner(System.in);

        //creo variables porque dentro del do no detecta el int.
        int multiplicando = 0;
        int multiplicador = 0;
        //creo un buleano para poder salir del bucle.
        boolean control;

        //creo un bucle para que vuelva a preguntar la pregunta si la respuesta no es valida.
        do {
            control = false;

            //uso un try para que controle las respuestas invalidas.
            try {
                System.out.println("Dime un numero de tres cifras...");
                multiplicando = teclado.nextInt();

                //cambio el valor para poder salir del bucle.
                control = true;

            } catch (Exception e) {
                System.out.println("Respuesta invalida...");
            }

            //escribo esto para que no ponga infinitas veces.
            teclado.nextLine();

            //hago un if que es una condicion, para que si introducen un numero de menor o superior de 3 cifras salte un aviso.
            if (multiplicando > 0) {
                if ((multiplicando > 999 || multiplicando < 100) && control == true) {
                    System.out.println("El numero debe de ser de 3 cifras");
                    control = false;
                }
            }

        } while (control == false);


        do {
            control = false;
            //uso un try para que controle las respuestas invalidas.
            try {
                System.out.println("Dime otro numero de tres cifras...");
                multiplicador = teclado.nextInt();

                control = true;

            } catch (Exception e) {
                System.out.println("Respuesta invalida...");
            }

            //escribo esto para que no ponga infinitas veces.
            teclado.nextLine();


            //hago un if que es una condicion, para que si introducen un numero de menor o superior de 3 cifras salte un aviso.
            if (multiplicador > 0) {
                if ((multiplicador > 999 || multiplicador < 100) && control == true) {
                    System.out.println("El numero debe de ser de 3 cifras");
                    control = false;
                }
            }

        } while (control == false);

        //convierto un int en un string
        String numero_1 = Integer.toString(multiplicador);

        //cojo el numero que esta en la poscion marcada para luego multiplicarlo por el multicplicando.
        String numero_principio = numero_1.substring(0, 1);
        int numero_principio_int = Integer.parseInt(numero_principio);
        int resultado_3 = (numero_principio_int * multiplicando);

        //cojo el numero que esta en la poscion marcada para luego multiplicarlo por el multicplicando.
        String numero_medio = numero_1.substring(1, 2);
        int numero_medio_int = Integer.parseInt(numero_medio);
        int resultado_2 = (numero_medio_int * multiplicando);

        //cojo el numero que esta en la poscion marcada para luego multiplicarlo por el multicplicando.
        String numero_final = numero_1.substring(2, 3);
        int numero_final_int = Integer.parseInt(numero_final);
        int resultado_1 = (numero_final_int * multiplicando);


        //voy mostrando los resultados.
        System.out.println("  " + multiplicando);
        System.out.println("x " + multiplicador);
        System.out.println("--------");
        System.out.println("  " + resultado_1);
        System.out.println(" " + resultado_2 + " ");
        System.out.println(resultado_3 + "  ");
        System.out.println("--------");
        System.out.println(multiplicando * multiplicador);
    }
}
