package org.example;

import java.util.Scanner;

public class Bucle_2_und2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inroduce el maximo");
        int maximo = teclado.nextInt();

        exterior:
        for (int i=1;i<=9;i++){
            System.out.println();
            System.out.println("Tabla del " + i);
            interior:
            for (int j=1;j<=10;j++){

                if (i*j>maximo){
                    break exterior ;
                }else{
                    System.out.println(i + " x " + j + " = " + (i*j));
                }



            }
        }


    }
}
