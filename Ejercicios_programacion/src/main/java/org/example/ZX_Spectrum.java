package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ZX_Spectrum {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int alto=0;
        int ancho=0;
        int contador=0;
        String test = "a";
        String test2 = "";
        int origen_x =0;
        int origen_y=0;
        int a=8;
        int b=8;

        System.out.println("****** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ******");
        System.out.println("Introduce la resolucion de tu pantalla (ancho x alto)...");

        do {
            contador++;
            if (contador>1){
                System.out.println("Valores introducidos incorrectos, inetnto num " + (contador-1));
            }
            System.out.println("Ancho:");
            ancho = teclado.nextInt();
            System.out.println("Alto");
            alto = teclado.nextInt();

        }while(ancho % 8 ==1 || alto % 8 == 1 || alto>48 || ancho>48);

        String matriz[][] = new String[alto][ancho];

        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada pixel:");
        for (int x = 0; x < matriz.length; x++) {
            String linea[] = teclado.next().split("");
            matriz[x]=linea;
            for (String silaba : linea){
                if (!silaba.matches("[A-O]")){
                    System.out.println("Valores introducidos incorrectos");
                    x--;
                }
            }

        }

        for (String x[] : matriz){
            for (String letra : x){
                System.out.print(letra + " ");
            }
            System.out.println();
        }

//        contador=0;
//        do {
//            externo:
//            for (int x = origen_x; x < a; x++) {                  test=matriz[x][y];
//                        test2=test;
//                    }
//
//                    if (!test2.contains(matriz[x][y])){
//                        test2+=matriz[x][y];
//                        contador++;
//                    }
//                }
//            }
//            if (origen_x%8 == 0 && origen_y%8==0 && origen_x>1 && origen_y>1){
//                if (origen_y<ancho){
//                    origen_x=0;
//                    a+=8;
//                }else if (origen_x<ancho){
//                    origen_y=0;
//                    b+=8;
//                }
//            }
//
//        }while (a<ancho && b<alto);
//
//        if (contador>1){
//            System.out.println("No es compatible...");
//        }else{
//            System.out.println("Es compatible...");
//        }
    }
}
