package org.example;

import java.util.Random;

public class Aleatorios {
    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(10)+1;// del 1 al 10
        int numero2 = aleatorio.nextInt(5,10);//no coje el 10
        System.out.println(numero);
        System.out.println(numero2);

        double numeo3 = aleatorio.nextDouble()*10;
        System.out.println(numeo3);

        double numero4 = Math.random()*10 +1;
        System.out.println(numero4);

    }
}
