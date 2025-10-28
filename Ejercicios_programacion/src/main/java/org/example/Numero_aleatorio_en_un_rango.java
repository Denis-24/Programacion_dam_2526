package org.example;

import java.util.Random;
import java.util.Scanner;

public class Numero_aleatorio_en_un_rango {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int rango = 0;
        int minimo = 0;
        int maximo = 0;
        int num_aleatorio = 0;

        try{
            System.out.println("Introduce el rango minimo...");
            minimo = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Valores introducidos incorrectos.");
            teclado.nextLine();
        }

        try{
            System.out.println("Introduce el rango maximo...");
            maximo = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Valores introducidos incorrectos.");
            teclado.nextLine();
        }

        try{
            System.out.println("Introduce el numero de aleatorios que quieres que aparezcan.");
            num_aleatorio = teclado.nextInt();
        }catch (Exception e){
            System.out.println("Valores introducidos incorrectos.");
            teclado.nextLine();
        }

        if (minimo < maximo){

            for (int i=0;i<num_aleatorio;i++){
                rango = aleatorio.nextInt(maximo - minimo + 1) + minimo;
                System.out.println(rango);
            }
        }
    }
}
