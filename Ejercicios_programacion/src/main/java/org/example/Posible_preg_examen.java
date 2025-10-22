package org.example;

import java.io.FilterOutputStream;

public class Posible_preg_examen {
    static void main() {

        int y = 5;
        int x = 2 * y;
        int z = 1 + x;

        int resultado = ++x == 11 && y > z ? y += z : //x=11 y=5 z=11
                z++ == 13 ? z *= x :
                        y * 5 >= ++z + 10 ? x += z : y++;
        System.out.println(resultado);

    }
}
