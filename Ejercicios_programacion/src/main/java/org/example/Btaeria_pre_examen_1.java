package org.example;

import java.util.Scanner;

public class Btaeria_pre_examen_1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        int i = 0;
        int num =0;

        System.out.println("Cuantos numero quieres introducir");
        int limite = teclado.nextInt();

        for (i=0;i>=limite;i++);{

            try{
                System.out.println("Introduce el numero " + i );
                num = teclado.nextInt();
            }catch (Exception e){
                System.out.println("valores introducidos incorrectos");
            }

            if (num > 0){
                System.out.println("El numero introducido es mayor que 0.");
            } else if (num < 0) {
                System.out.println("El numero es menor que 0.");
            }else{
                System.out.println("El numero es iguala 0.");
            }
        }
    }
}
