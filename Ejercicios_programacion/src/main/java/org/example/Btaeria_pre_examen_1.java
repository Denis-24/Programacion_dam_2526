package org.example;

import java.util.Scanner;

public class Btaeria_pre_examen_1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int i = 0;

        System.out.println("Cuantos numero quieres introducir");
        int limite = teclado.nextInt();

        for (i=0;i>=limite;i++);{
            System.out.println("Introduce el numero " + i );
            int num = teclado.nextInt();
            
        }
    }
}
