package org.example;

import java.util.Scanner;

public class La_Patriferia {
    static void main() {
        //Defino ya algunas constantes ya que no van a cambiar su valor.
        Scanner teclado = new Scanner(System.in);
        final int ALTURA_MINIMA = 140;
        final int ALTURA_MAXIMA = 230;
        final int PESO_MAXIMO = 120;
        //Damos la bienvenida antes e ejecutar cualquier cosa.
        System.out.println("!BIENVENIDOS A LA PATRILANDIA");
        //cro una variable altura ya que si esta entro del try no lo detecta.
        int altura = 0;
        //hago un boolean para poder salir del bucle.
        boolean control = false;
        //coloco un do para poder hacer un bucle que cuando la respuesta este mal vuelva a preguntar.
        do {
            //coloco un try para que detecte entradas invalidas como texto.
            try {
                System.out.println("Introduce cuanto mides (cm)...");
                altura = teclado.nextInt();
                control = true;
            }catch (Exception e){
                System.out.println("SOLO PUEDES INTRODUCIR NUMEROS POSITIVOS...");
                teclado.nextLine();
            }
        }while (control == false);
        //Hago una condicion para que si el susuario no pasa las condiciones le salte un mensaje de que no puede pasar y ademas se le calcula la altura que le falta para poder llegar a lo minimo.
        if (altura < ALTURA_MINIMA) {
            System.out.println("LO SIENTO NO TE PUEDES SUBIR. TE FALTAN " + (ALTURA_MINIMA - altura) + "cm");
        }else if (altura > ALTURA_MAXIMA){
            System.out.println("ERROR DE LECTURA. PORFAVOR VUELVE A SUBIR A LA BASCULA");

        }else {
            //Creo la variable peso porque dentro del try no lo detecta.
            int peso = 0;
            //Creo un do para hacer un bucle.
            control = false;
            do {
                //coloco un try para que detecte entradas invalidas como texto.
                try {
                    System.out.println("Introduce tu peso (kg)...");
                    peso = teclado.nextInt();
                    control = true;
                }catch (Exception e){
                    System.out.println("DEBES INTRODUCIR NUMEROS...");
                    teclado.nextLine();
                }
            }while (control == false);
            //creo una variable.
            int peso_min = altura * 2 / 8;
            //Hago una condicion la cual si te pasas de peso o te quedas corto te pone un mensaje. Y que si el peso introducido por el usuario esta entre los limites salta un mensaje e que se puede subri a la atracion.
            if (peso > PESO_MAXIMO){
                System.out.println("LO SIENTO. Sobrepasas " + (PESO_MAXIMO - peso) + " kg");
            }else if (peso < peso_min){
                System.out.println("LO SIENTO. TE FALTAN " + (peso_min - peso) + " kg");
            }else {
                System.out.println("PESAS " + peso + " kg. PESO MINIMO CALCULADO: " + peso_min + " kg.");
                System.out.println("!SUBE A LA ATRACCION!");
            }
        }

    }

}
