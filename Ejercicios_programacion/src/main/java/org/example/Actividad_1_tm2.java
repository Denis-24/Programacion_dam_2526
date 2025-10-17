package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad_1_tm2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        final int ANYO_MINIO = 1900;
        int anyo_nacimineto_int = 0;

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        System.out.println("Elige un modo...");
        System.out.println("(1) - año de nacimineto");
        System.out.println("(2) - edad");
        System.out.println("-----------------------------");

        boolean control = true;
        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("valor del modo incorrecto.");
            control=false;
        }
        if (control){
            if (modo==1){

                System.out.println("introduce tu año de nacimineto");
                String anyo_nacimineto = teclado.next();

                try{
                    anyo_nacimineto_int = Integer.parseInt(anyo_nacimineto);
                }catch (NumberFormatException e){
                    System.out.println("El formato no es numerico.");
                    return;
                }


            }else if (modo==2){

                int edad = 0;

                System.out.println("Introduce tu edad");

                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else {
                    System.out.println("La edad no tiene formato correspondiente (numerico)");
                    return;
                }

                if (edad>=0){
                    anyo_nacimineto_int = anyo_actual-edad;


                }else {
                    System.out.println("La edad no es correcta.");
                    return;
                }

            }else {
                System.out.println("valor del modo incorrecto");
                return;
            }

            if (anyo_nacimineto_int>=ANYO_MINIO && anyo_nacimineto_int<=anyo_actual){

                if (anyo_nacimineto_int<=1927){
                    System.out.println("Generaciom sin bautizar.");
                } else if (anyo_nacimineto_int>=1928 && anyo_nacimineto_int<=1944) {
                    System.out.println("Generacion silent");
                } else if (anyo_nacimineto_int>=1945 && anyo_nacimineto_int<=1964) {
                    System.out.println("Baby boomer");
                } else if (anyo_nacimineto_int>=1965 && anyo_nacimineto_int<=1981) {
                    System.out.println("Generacion X");
                } else if (anyo_nacimineto_int>=1982 && anyo_nacimineto_int<=1994) {
                    System.out.println("Generacion Y");
                }else {
                    System.out.println("Generacion Z");
                }
            }
        }
        int numero = 1;
        char caracter = 'A';
        String palabra = "Denis";

        switch (palabra){
            case 1:
                System.out.println("El alumno es raul");
                break;
            case 2:
                System.out.println("La profe es Patricia ");
                break;
            default:
                System.out.println("No conozco ese nombre");
                break;
        }
    }
}
