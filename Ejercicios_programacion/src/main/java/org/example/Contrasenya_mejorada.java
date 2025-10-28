package org.example;

import java.util.Random;

public class Contrasenya_mejorada {
    static void main() {
        Random aleatorio = new Random();

        String caracter_max = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracter_min = "abcdefghijklmnopqrstuvwxyz";
        String caracter_num = "0123456789";


        int numero_ale_max = aleatorio.nextInt(caracter_max.length());
        int numero_ale_min = aleatorio.nextInt(caracter_min.length());
        int numero_ale_num = aleatorio.nextInt(caracter_num.length());

        //creo un random para cada string y despues los sustituyo en un numero aleatorio de la contraseña ya creada.
    }
}
