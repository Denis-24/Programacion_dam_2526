package org.example;

import java.util.Scanner;

public class bucle_3_und2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inrtoduce el valor de m: ");
        int m = teclado.nextInt();

        exterior:
        for (int i=2;i<=m;i++){
            interior:
            for (int j=2;j<i;j++){

                if (i % j ==0){
                    continue exterior;
                }


            }

            System.out.print(i + " ");

        }

    }
}
