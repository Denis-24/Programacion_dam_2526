package org.example;

import java.util.Random;

public class Contrasenya_mejorada {
    static void main() {
        Random aleatorio = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tamanyo = aleatorio.nextInt(8,13);


        String contrasenya ="";

        for (int i = 0; i<tamanyo; i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }

        int tamanyo_contrasenya = contrasenya.length();

        String caracter_max = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracter_min = "abcdefghijklmnopqrstuvwxyz";
        String caracter_num = "0123456789";

        //numero aleatorio que va a seleccionar que caracter coger
        int numero_ale_max = aleatorio.nextInt(caracter_max.length());
        int numero_ale_min = aleatorio.nextInt(caracter_min.length());
        int numero_ale_num = aleatorio.nextInt(caracter_num.length());

        //caracter escogido por el numero aleatorio
        char letra_max = caracter_max.charAt(numero_ale_max);
        char letra_min = caracter_min.charAt(numero_ale_min);
        char num = caracter_num.charAt(numero_ale_num);

        //numero aleatorio que se va a sustituir en la contraseña
        int posicion1_contrsenya = aleatorio.nextInt(tamanyo_contrasenya);
        int posicion2_contrsenya = aleatorio.nextInt(tamanyo_contrasenya);
        int posicion3_contrsenya = aleatorio.nextInt(tamanyo_contrasenya);

        //letra de la contraseña que se va acambiar elegida por el numero aleatorio.
        char letra1_sus = contrasenya.charAt(posicion1_contrsenya);
        char letra2_sus = contrasenya.charAt(posicion2_contrsenya);
        char letra3_sus = contrasenya.charAt(posicion3_contrsenya);

        String contrasenya_paso1 = contrasenya.replace(letra1_sus,letra_max);
        String contrasenya_paso2 = contrasenya_paso1.replace(letra2_sus,letra_min);
        String contrasenya_paso3 = contrasenya_paso2.replace(letra3_sus,num);

        System.out.println("");
        System.out.println("Contraseña segura sugerida = " + contrasenya_paso3);

    }
}
