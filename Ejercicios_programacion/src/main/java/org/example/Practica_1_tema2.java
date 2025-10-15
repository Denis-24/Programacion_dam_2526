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
        } else{

            String dia_string = fecha.substring(0,2);
            String mes_string = fecha.substring(3,5);
            String anyo_string = fecha.substring(6,10);

            int dia = Integer.parseInt(dia_string);
            int mes = Integer.parseInt(mes_string);
            int anyo = Integer.parseInt(anyo_string);

            int suma = dia + mes + anyo;
            System.out.println(suma);

        }

    }

}
