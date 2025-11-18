package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class La_Primitiva {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        int extra=aleatorio.nextInt(10);
        int vector1[] = new int[6];
        String formato = "\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}";
        int Complemento = aleatorio.nextInt(1,50);
        int reintegro = aleatorio.nextInt(0,9);

        System.out.println("Introduce los datos de tu boleto:");
        String resultado= teclado.next();

        if (resultado.matches(formato)==true){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }

        for (int i=0;i<vector1.length;i++){
            vector1[i]=resultado.charAt(i);
        }
        System.out.println(Arrays.toString(vector1));


        for (int i=0;i<vector1.length;i++){
            vector1[i]=aleatorio.nextInt(1,50);
        }

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(vector1));
        System.out.println("complementario = " + Complemento);
        System.out.println("Reintegro: " + reintegro);



















    }
}
