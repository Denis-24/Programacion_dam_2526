package org.example;

import java.util.Scanner;

public class Practica_3_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        String isbn_ejemplo = "xxxxxxxxxx";
        int limite = isbn_ejemplo.length();
        int limite_1;
        int limite_2;

        System.out.println("-------------------");
        System.out.println("!Validador de ISBN!");
        System.out.println("-------------------");
        System.out.println("(1) Validar ISBN");
        System.out.println("(2) Reparar ISBN");
        System.out.println("(3) Salir");
        System.out.println("-------------------");
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
                    System.out.println("Bienvenido, introduce el ISBN para poder validarlo.");
                    String validar = teclado.next();

                    //Haggo esto para que si escriben la X en minuscula se ponga automaticamente en mayuscula para que no haya ningun problema.
                    String validar_mayucula = validar.toUpperCase();

                    limite_1 = validar.length();

                    if (limite_1 < limite || limite_1 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                    }

                    int suma = 0;

                    for (int i = 0; i< limite_1; i++){
                        char c = validar_mayucula.charAt(i);
                        int valor;


                        // Si es X en la ultima posicion, vale 10
                        if (c == 'X' && i == 9) {
                            valor = 10;
                        } else {
                            valor = Integer.parseInt(String.valueOf(c)); // convierte el carácter en número
                        }

                        int peso = 10 - i; // pesos de 10 a 1
                        int producto = valor * peso;

                        suma += producto;
                    }

                    if (suma % 11 == 0) {
                        System.out.println("El ISBN es valido.");
                    } else {
                        System.out.println("El ISBN no es valido.");
                    }

                    break;

                case 2:
                    System.out.println("Bienvenido, introduce el ISBN el cual quieres reparar.");
                    String reparar = teclado.next();

                    limite_2 = reparar.length();

                    if (limite_2 > limite || limite_2 < limite){
                        System.out.println("ISBN introducido es incorrecto.");
                    }
                    int posicion = reparar.indexOf("?");

                    int posicion_1 = reparar.lastIndexOf("?");

                    if (posicion != posicion_1){
                        System.out.println("ISBN introducido es incorrecto.");
                        break;
                    }

                    for (int correcto = 0; correcto<10; correcto++) {

                        int suma_3 = 0;
                        boolean valido = true;

                        for (int i = 0; i < 10; i++) {
                            char c = reparar.charAt(i);
                            int valor = 0;

                            if (i == posicion_1) {
                                valor = correcto;

                            } else if (c == 'X' && i == 9) {
                                valor = 10;

                            } else if (c >= '0' && c <= '9') {
                                valor = Integer.parseInt(String.valueOf(c));
                            } else {
                                valido = false;
                            }

                            int peso = 10 - i;
                            suma_3 += valor * peso;

                        }
                        if (valido && suma_3 % 11 == 0) {
                            if (correcto == 10 && posicion_1 == 9) {
                                System.out.println("El digito que falta es X");
                            } else {
                                System.out.println("EL digito que falta es " + correcto);
                            }
                            return;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
