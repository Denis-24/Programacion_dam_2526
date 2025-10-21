package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double resultado = 0;
        double operando_1 = 0;
        double operando_2 = 0;
        boolean control = false;

        System.out.println("!BIENVENIDO!");
        do {
            try{
                System.out.println("Introduce un  primer operando...");
                operando_1 = teclado.nextDouble();
                control = true;
            }catch (Exception e){
                System.out.println("Valores introducidos incorrectos...");
                teclado.nextLine();
            }
        }while (control == false);

        System.out.println("------------------.");
        System.out.println("[+] -> suma");
        System.out.println("[-] -> resta");
        System.out.println("[x] -> multiplicacion");
        System.out.println("[/] -> division");
        System.out.println("[R] -> raiz");
        System.out.println("-------------------");

        System.out.println("Elige una operacion...");
        String operacion = teclado.next();

        if (!operacion.equals("R")){
            System.out.println("Introduce un segundo operando...");
            operando_2 = teclado.nextDouble();
        }

        switch (operacion){
            case "+":
                resultado = operando_1 + operando_2;
                break;
            case "-":
                resultado = operando_1 - operando_2;
                break;
            case "x":
                resultado = operando_1 * operando_2;
                break;
            case "/":
                if (operando_2 == 0){
                    System.out.println("No se puede dividir entre 0...");
                    return;
                }
                resultado = operando_1 / operando_2;
                break;
            case "R":
                resultado = Math.sqrt(operando_1);
                break;

            default:
                System.out.println("Valores introducidos incorrectos");
                return;
        }

        if (!operacion.equals("R")){
            System.out.println("El resultado de " + operando_1 + " " + operacion + " " + operando_2 + " = " + resultado);
        }
    }
}
