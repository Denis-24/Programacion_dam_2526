package org.example;

public class Ternario {
    static void main() {
        //caso 1
        int a = 1, b = 2, c = 3;
        int resultado = a++ == 2 && c > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);

        //caso 2a = 1; b = 2; c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        a == c ? a++ : a--;

        System.out.println(resultado);

        //caso 3
        a = 1; b = 2; c = 3;

        resultado = a++ == 1 && a > b++ ? a += b :
                a > 0 && a == b ? a += c :
                        b == c ? a++ : a--;

        System.out.println(resultado);


    }
}
