package org.example;

import java.util.Scanner;

public class ejecicio_5_prueba {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double num1 =0;
        double num2 =0;

        boolean control = true;
        do {
            try {
                System.out.println("Dime un numero...");
                num1 = teclado.nextDouble();

                System.out.println("Dime otro numero...");
                num2 = teclado.nextDouble();

                control = false;

            }catch (Exception e){
                System.out.println("Debes introducir un numero. Vuele a introducirlos...");
                teclado.nextLine();
            }

        }while(control==true);

        if (num2 == 0) {
            System.out.println("ERROR no se puede dividir entre cero");
        }else {
            double division = num1 / num2;
            System.out.println("La division es: " + division);
        }

    }
}
