package org.example;

import java.util.Scanner;

public class Practica_1_tema2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        final int DIA_MAX = 31;
        final int MES_ANYO = 12;
        final int ANYO_MAX = 2025;
        final int ANYO_MIN = 1900;

        //Modelo de referencia para saber el tamaño de la respuesta.
        String fecha_ejemplo = "dd/mm/aaaa";
        int limite = fecha_ejemplo.length();

        //pregunto por una fecha
        System.out.println("Introduce tu fecha de nacimineto (dd/mm/aaaa)");
        String fecha = teclado.next();

        //guardo la longitud de la fecha.
        int fecha_tamaño = fecha.length();

        //compruebo que las barras estan en el sitio correcto del la fecha que me ha dado. Y ademas compruebo que no haya simbolos de negativo.
        if (fecha.substring(2,3).equals("/") == false || fecha.substring(5,6).equals("/") == false || ((fecha_tamaño - limite) > 0) || (fecha.contains("-"))){
            System.out.println("Valores introducidos incorrectos.");
        } else {
            //guardo las posiciones en una variable.
            String dia_string = fecha.substring(0,2);
            String mes_string = fecha.substring(3,5);
            String anyo_string = fecha.substring(6,10);

            //Creo una variable porque dentro del try no me lo detecta
            int dia = 0;
            int mes = 0;
            int anyo = 0;

            //hago un try-catch para que me compruebe que no hayan escrito
            try {
                    dia = Integer.parseInt(dia_string);
                    mes = Integer.parseInt(mes_string);
                    anyo = Integer.parseInt(anyo_string);

            }catch (Exception e){
                    System.out.println("No se pueden introducir letras");
                    return;
            }

            //establezco los limites de dia, mes, anyo.
            if (dia > DIA_MAX || dia < 1){
                System.out.println("Dias del 1 al 31");
            } else if (mes > MES_ANYO || dia < 1) {
                System.out.println("Meses del 1 al 12");
            } else if (anyo > ANYO_MAX || anyo < ANYO_MIN) {
                System.out.println("Años del 1900 al 2025");
            }else {
                //creo una variable que es la suma de dia,mes,anyo.
                int suma = dia + mes + anyo;
                System.out.println(dia + " + " + mes + " + " + anyo + " = " + suma);

                //cambio la suma a texto para poder hacer lo siguientes pasos.
                String suma_stringe = Integer.toString(suma);

                //cogo de el total de la suma y guardo cada numero de la suma en distintas variables.
                String num1_string = suma_stringe.substring(0, 1);
                String num2_string = suma_stringe.substring(1, 2);
                String num3_string = suma_stringe.substring(2, 3);
                String num4_string = suma_stringe.substring(3, 4);

                //Cambio de stringe a int para despues poder sumar los numeros guardados anteriormente.
                int num1 = Integer.parseInt(num1_string);
                int num2 = Integer.parseInt(num2_string);
                int num3 = Integer.parseInt(num3_string);
                int num4 = Integer.parseInt(num4_string);

                //creo una variable que contiene la suma de los numero anteriormente guardados.
                int suerte = num1 + num2 + num3 + num4;
                System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + suerte);
                System.out.println("Tu numero de la suerte es: " + suerte);
            }
        }

    }

}
