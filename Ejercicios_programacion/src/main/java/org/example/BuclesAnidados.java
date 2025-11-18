package org.example;

public class BuclesAnidados {
    static void main() {

        externo:
        for (int i=0;i<9;i++){
            System.out.println("Soy el externo con i = " + i);
            interno:
            for (int j=10;j>=0;j--){
                System.out.println("Soy el interno con j = " + j);
                if (j==5){
                    continue externo;
                }

                System.out.println("Hola" + (j+1));




            }
        }
    }
}
