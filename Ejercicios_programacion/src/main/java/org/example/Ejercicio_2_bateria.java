package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_2_bateria {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double horas =0;
        double tarifa =0;
        boolean control = false;
        do {
           try {
               System.out.println("Dime cuantas horas trabajas a la semana...");
               horas = teclado.nextDouble();

               System.out.println("Dime cual es tu tarifa por hora...");
               tarifa = teclado.nextDouble();

               control = true;
           }catch (Exception e){
               System.out.println("Debes introducir numeros...");
               teclado.nextLine();
           }
        }while(control == false);

        if (horas > 40) {
            double horas_normal = 40;
            double horas_extra = horas - 40;
            double sueldo = ((horas_extra * (tarifa * 1.5)) + (horas_normal * tarifa));
            System.out.println("Tu sueldo con las horas extra multiplicando tu tarifa por 1.5 es de: " + sueldo + " euros");
        }else {
            double sueldo = horas * tarifa;
            System.out.println("Tu sueldo es de " + sueldo + " euros");
        }

    }
}
