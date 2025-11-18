package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class La_Primitiva {
    static void main() {

        Random aleatorio = new Random();

        Scanner teclado = new Scanner(System.in);

        int extra=aleatorio.nextInt(10);


        int vector1[] = new int[6];
        String formato = "\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}";
        int Complemento = aleatorio.nextInt(1,50);
        int reintegro = aleatorio.nextInt(0,9);
        int vector_2[] = new int[7];





        System.out.println("Introduce los datos de tu boleto:");
        String resultado= teclado.next();

        if (resultado.matches(formato)==true){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }


        for (int i=0;i<vector1.length;i++){
            vector1[i]=aleatorio.nextInt(1,50);
        }

        String vector_prueba[] = resultado.split("-");

        System.out.println(Arrays.toString(vector_prueba));

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(vector1));
        System.out.println("complementario = " + Complemento);
        System.out.println("Reintegro: " + reintegro);

        System.out.println("hola");




















    }
}
