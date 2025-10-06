package org.example;

import java.util.Scanner;

public class Practica_4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);


        int multiplicando = 0;
        int multiplicador = 0;
        boolean control;

        do {
            control = false;
            try {
                System.out.println("Dime un numero de tres cifras...");
                multiplicando = teclado.nextInt();

                control = true;

            }catch (Exception e) {
                System.out.println("Respuesta invalida...");
            }
            teclado.nextLine();
            if ((multiplicando > 999 || multiplicando < 100) && control == true) {
                System.out.println("El numero debe de ser de 3 cifras");
                control = false;
<<<<<<< HEAD
            }else if ((multiplicando > -100 || multiplicando < -999) && control == true){
                System.out.println("El numero debe de ser de 3 cifras ");
                control = false;
=======
>>>>>>> 0dd46616a0ac2069bb1d8092901e492ec89907ed
            }

        }while (control==false);


        do {
            control = false;
            try {
                System.out.println("Dime otro numero de tres cifras...");
                multiplicador = teclado.nextInt();

                control = true;

            }catch (Exception e) {
                System.out.println("Respuesta invalida...");
            }
            teclado.nextLine();
            if ((multiplicador >= 999 || multiplicador <= 100) && control == true){
                System.out.println("El numero debe de ser de 3 cifras");
                control = false;
<<<<<<< HEAD
            }else if ((multiplicador >= -100 || multiplicador <= -999) && control == true){
                System.out.println("El numero debe de ser de 3 cifras");
                control = false;
=======
>>>>>>> 0dd46616a0ac2069bb1d8092901e492ec89907ed
            }

        }while (control==false);

        String numero_1 = Integer.toString(multiplicador);

        String numero_principio = numero_1.substring(0,1);
        int numero_principio_int = Integer.parseInt(numero_principio);
        int resultado_3 = (numero_principio_int * multiplicando);


        String numero_medio = numero_1.substring(1,2);
        int numero_medio_int = Integer.parseInt(numero_medio);
        int resultado_2 = (numero_medio_int * multiplicando);


        String numero_final = numero_1.substring(2,3);
        int numero_final_int = Integer.parseInt(numero_final);
        int resultado_1 = (numero_final_int * multiplicando);

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
