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

        contador=0;
        externo:
        for (int x = origen_x; x < a; x++) {
            for (int y = origen_y; y < b; y++) {
                if (x==0 && y==0){
                    test=matriz[x][y];
                    test2=test;
                }

                if (!test2.contains(matriz[x][y])){
                    test2+=matriz[x][y];
                    contador++;
                }

                if (origen_x%8 == 0 && origen_y%8==0 && origen_x>1 && origen_y>1){
                    if (y<ancho){
                        origen_x=0;
                        a+=8;
                    }if (x<ancho){
                        origen_y=0;
                        b+=8;
                    }
                }
            }
        }

        if (contador>1){
            System.out.println("No es compatible");
        }else{
            System.out.println("Es compatible...");
        }

//        externo:
//        for (String fila[] : matriz){
//            interno:
//            for (int x = 0, j=0; x < fila.length-1; x++ , j++) {
//
//                test=fila[0];
//                test2=test;
//                boolean hay = Arrays.asList(test2).contains(fila[x]);
//                if (!hay){
//                    test2=fila[x];
//                }
//
//                if (ancho==16) {
//                    if (j%8==0){
//                        test=fila[j];
//                        test2=test;
//                        hay = Arrays.asList(test2).contains(fila[x]);
//                        if (!hay){
//                            test2=fila[x];
//                        }
//                    }
//                } else if (ancho==24) {
//
//                } else if (ancho==32) {
//
//                } else if (ancho==40) {
//
//                } else if (ancho==48) {
//
//                }
//
//                if (fila[x].equals(test)==false || fila[x].equals(test2)==false){
//                    contador++;
//                }
//        }
    }
}
