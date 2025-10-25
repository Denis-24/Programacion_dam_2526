package org.example;

import java.util.Scanner;

public class Practica_3_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        String isbn_ejemplo = "xxxxxxxxxx";
        int limite = isbn_ejemplo.length();
        int limite_1 = 0;
        int limite_2 = 0;
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

                    limite_1 = validar.length();

                    if (limite_1 < limite || limite_1 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                    }

                    for (int i = 0; i< limite_1; i++){
                        System.out.println(validar.charAt(i));
                    }

                    for (int j=10; j>=1; j--){
                        System.out.println(j);
                    }



                    break;
                case 2:
                    System.out.println("Introduce el ISBN para reparar.");
                    String reparar = teclado.next();

                    limite_2 = reparar.length();

                    if (limite_2 < limite || limite_2 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                    }
                    break;
                case 3:
                    break;
            }
        }
    }
}
