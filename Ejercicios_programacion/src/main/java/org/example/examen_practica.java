package org.example;

import java.util.Random;
import java.util.Scanner;

public class examen_practica {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Random aleatorio= new Random();
        int adivinar = aleatorio.nextInt(0,11);
        int intento = 0;
        int num= 0;


        do {
            intento++;
            System.out.println("Introduce el numero que crees que es. Intento numero = " + intento);
            num = teclado.nextInt();

            if (num<adivinar){
                System.out.println("El numero es mayor");
            } else if (num>adivinar){
                System.out.println("EL numero es menor");
            }


        }while (num!=adivinar && intento <=10);

        if (num==adivinar){
            System.out.println("Has adivinado el numero " + adivinar);
            System.out.println("Lo has adivinado en = " + intento);
        }
    }
}
