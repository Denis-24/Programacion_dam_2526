package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //creo los double ya que dentro del try-catch no lo detecta, ademas creo un buleano para poder salir del bucle que hay a continuacion.
        double resultado = 0;
        double operando_1 = 0;
        double operando_2 = 0;
        boolean control = false;

        //doy la bienvenida y creo un bucle con el try catch para que vuelva  preguntar la pregunta si la respuesta hace saltar el catch.
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

        //muestro por pantalla los tipos de operaciones que se pueden hacer.
        System.out.println("------------------.");
        System.out.println("[+] -> suma");
        System.out.println("[-] -> resta");
        System.out.println("[x] -> multiplicacion");
        System.out.println("[/] -> division");
        System.out.println("[R] -> raiz");
        System.out.println("-------------------");

        //pregunto por la operacion que quiere que haga.
        System.out.println("Elige una operacion...");
        String operacion = teclado.next();

        control = false;

        //hago un if por si elige la opcion de raiz que no pida el segundo operando ya que no se necesita. tmabien hago un try-catch para comprobar que el resultado es valido.
        if (!operacion.equals("R") || (!operacion.equals("r"))){
            do {
                try{
                    System.out.println("Introduce un segundo operando...");
                    operando_2 = teclado.nextDouble();
                    control = true;
                }catch (Exception e){
                    System.out.println("Valores introducidos incorrectos...");
                    teclado.nextLine();
                }
            }while (control == false);

        }

        //creo un switch con los casos que he mostrado antes por pantalla de las operaciones. Dependiedno del caso que haya elegido se hara una operacion o otra. y se guardara en resultados.
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
        }else {
            System.out.println("El resultado de " + operando_1 + " " + operacion + " = " + resultado );
        }
    }
}
