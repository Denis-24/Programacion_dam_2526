package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_1_Bateria {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double horas = 0;
        double tarifa = 0;
        boolean control = false;

        do {
            try{
                System.out.println("Dime cuantas horas a la semana trabajas...");
                horas = teclado.nextDouble();

                System.out.println("Dime cual es tu tarifa por hora...");
                tarifa = teclado.nextDouble();

                control =true;

            }catch (Exception e){
                System.out.println("Debes introducir numeros...");
                teclado.nextLine();
            }
        }while(control==false);

        double sueldo = horas * tarifa;
        System.out.println("Tu sueldo a la semana es de " + sueldo + " euros");

    }
}