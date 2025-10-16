package org.example;

import java.util.Scanner;

public class Practica_1_tema2 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        String fecha = "";
        String fecha_ejemplo = "dd/mm/aaaa";
        boolean control = false;
        int limite = fecha_ejemplo.length();

        do {
            try{
                System.out.println("Introduce tu fecha de nacimineto (dd/mm/aaaa)");
                fecha = teclado.next();
                control = true;

            }catch (Exception e){
                System.out.println("Valores introducidos incorrectos.");
            }
        }while(control == false);

        int fecha_tamaño = fecha.length();

        if (fecha.substring(2,3).equals("/") == false || fecha.substring(5,6).equals("/") == false || ((fecha_tamaño - limite) > 0)){
            System.out.println("Valores introducidos incorrectos.");
        } else if (fecha.contains("-")){
            System.out.println("Valores introducidos incorrectos.");
        }else {
            String dia_string = fecha.substring(0,2);
            String mes_string = fecha.substring(3,5);
            String anyo_string = fecha.substring(6,10);

            int dia = Integer.parseInt(dia_string);
            int mes = Integer.parseInt(mes_string);
            int anyo = Integer.parseInt(anyo_string);

            if (dia > 31 || dia < 1){
                System.out.println("Dias del 1 al 31");
            } else if (mes > 12 || dia < 1) {
                System.out.println("Meses del 1 al 12");
            } else if (anyo > 2025 || anyo < 1900) {
                System.out.println("Años del 1900 al 2025");
            }else {
                int suma = dia + mes + anyo;

                String suma_stringe = Integer.toString(suma);

                String num1_string = suma_stringe.substring(0,1);
                String num2_string = suma_stringe.substring(1,2);
                String num3_string = suma_stringe.substring(2,3);
                String num4_string = suma_stringe.substring(3,4);

                int num1 = Integer.parseInt(num1_string);
                int num2 = Integer.parseInt(num2_string);
                int num3 = Integer.parseInt(num3_string);
                int num4 = Integer.parseInt(num4_string);

                int suerte = num1 + num2 + num3 + num4;
                System.out.println("Tu numero de la suerte es: " + suerte);
            }
        }

    }

}
