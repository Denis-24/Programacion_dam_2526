package org.example;

import java.util.Scanner;

public class Bucle_2 {
    static void main() {

        Scanner tecaldo = new Scanner(System.in);

        System.out.println("escribe un numero");
        int n = tecaldo.nextInt();

        for (int i = n; i>=1; i--){
            System.out.println(i);
        }

    }
}
