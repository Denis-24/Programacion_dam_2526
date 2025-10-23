package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Bucle_4 {
    static void main() {

        Scanner tecaldo = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = tecaldo.next();
        int letra = palabra.length();
        for (int i=0;i<letra;i++){
            System.out.println(palabra.charAt(i));
        }
        for (int j=letra-1;j>=0;j--){
            System.out.println(palabra.charAt(j));
        }
    }
}
