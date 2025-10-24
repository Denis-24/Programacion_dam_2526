package org.example;

import java.util.Scanner;

public class Practica_3_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        String isbn_ejemplo = "xxxxxxxxxx";
        int tamanyo = isbn_ejemplo.length();
        int tamanyo_1 = 0;
        int tamanyo_2 = 0;
        int num = 10;

        System.out.println("!Validador de ISBN!");
        System.out.println("(1) Validar ISBN");
        System.out.println("(2) Reparar ISBN");
        System.out.println("(3) Salir");
        System.out.println("Introduce el modo...");


        boolean control = true;
        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("Valor introducido incorrecto.");
            control = false;
        }

        if (control){
            switch (modo){
                case 1:
                    System.out.println("Introduce el ISBN para validar.");
                    String validar = teclado.next();

                    tamanyo_1 = validar.length();

                    if (tamanyo_1 < tamanyo || tamanyo_1 > tamanyo){
                        System.out.println("ISBN introducido incorrecto.");
                    }

                    for (int i=0; i<=tamanyo_1; i++){
                        System.out.println(validar.charAt(i));
                    }


                    break;
                case 2:
                    System.out.println("Introduce el ISBN para reparar.");
                    String reparar = teclado.next();

                    tamanyo_2 = reparar.length();

                    if (tamanyo_2 < tamanyo || tamanyo_2 > tamanyo){
                        System.out.println("ISBN introducido incorrecto.");
                    }
                    break;
                case 3:
                    break;
            }
        }
    }
}
