package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class vectores {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        int vector[] = {1,4,8,3,9};

        String vectorstring[] = {"angel","Denis","Adrian"};

        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        vector[0] = 7;
        vector[2] = 6;

        String vector2[] = new String[10];

        System.out.println(Arrays.toString(vector2));

        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
        System.out.println("---");
        for (int j=vector.length-1;j>=0;j--){
            System.out.println(vector[j]);
        }

        int vector3[] = new int[8];

        vector3=vector;

        vector3=vector.clone();

        System.out.println(vector3);

        for (int i=0;i<vector3.length;i++){
            vector3[i]= aleatorio.nextInt(501);
        }

        System.out.println(Arrays.toString(vector3));

        int vector4[] = new int[4];

        for (int i =0;i<vector4.length;i++){
            try{
                vector3[i] = teclado.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Valor introducido incorrecto");
            }
        }

        System.out.println(vector4);



    }
}
