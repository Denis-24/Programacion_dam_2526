package org.example;

import java.util.Random;

public class Ejercicios_Randoms {
    static void main() {
        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(1,7);
        int dado2 = aleatorio.nextInt(1,7);

        System.out.println("El numero del dado 1 es = " + dado1);
        System.out.println("El numero del dado 2 es = " + dado2);

        int suma = dado1 + dado2;

        System.out.println("La suma de los dos dados es = " + suma);
    }
}
