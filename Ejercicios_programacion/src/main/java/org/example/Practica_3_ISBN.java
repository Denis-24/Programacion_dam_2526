package org.example;

import java.util.Scanner;

public class Practica_3_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        //creo variables ya que dentro del case no lo detecta.
        int modo = 0;
        //creo un ejemplo del isbn para saber el tamaño maximo para desues comprobar.
        String isbn_ejemplo = "xxxxxxxxxx";
        int limite = isbn_ejemplo.length();
        int limite_1;
        int limite_2;

        //Muestro por pantalla los modos que hay.
        System.out.println("-------------------");
        System.out.println("!Validador de ISBN!");
        System.out.println("-------------------");
        System.out.println("(1) Validar ISBN");
        System.out.println("(2) Reparar ISBN");
        System.out.println("(3) Salir");
        System.out.println("-------------------");
        System.out.println("Introduce el modo...");

        //creo un if para comprobar de que se introducen numeros.
        boolean control = true;
        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("Valor introducido incorrecto.");
            control = false;
        }

        if (control){
            //creo un switch para hacer distintas cosas dependiendo el modo que elija.
            switch (modo){
                case 1:
                    String validar = "hola";
                    try{
                        System.out.println("Bienvenido, introduce el ISBN para poder validarlo.");
                        validar = teclado.next();
                    }catch (Exception e){
                        System.out.println("Valores introducidos incorrectos.");
                        teclado.nextLine();
                    }


                    //Haggo esto para que si escriben la X en minuscula se ponga automaticamente en mayuscula para que no haya ningun problema.
                    String validar_mayucula = validar.toUpperCase();

                    limite_1 = validar.length();

                    int suma = 0;

                    //copruebo la longitud del isbn.
                    if (limite_1 < limite || limite_1 > limite){
                        System.out.println("ISBN introducido incorrecto.");
                        break;

                    }else {

                        //hago un for para que vayan guardando los numeros que salen en el char donde corresponde en el isbn.
                        for (int i = 0; i< limite_1; i++){
                            char c = validar_mayucula.charAt(i);
                            int valor;


                            // Si es X en la ultima posicion, vale 10
                            if (c == 'X' && i == 9) {
                                valor = 10;
                            } else {
                                valor = Integer.parseInt(String.valueOf(c)); // convierte el carácter en número
                            }

                            int peso = 10 - i; // pesos de 10 a 1 dependiendo de donde esta la i.
                            int producto = valor * peso; // hago la multiplicacion de valor por peso.

                            suma += producto; //voy sumando los resultados del producto.
                        }
                    }


                    //compruebo si el resultado es divisible ente 11 y si lo es digo que es valido, sino digo que es invalido.
                    if (suma % 11 == 0) {
                        System.out.println("El ISBN es valido.");
                    } else {
                        System.out.println("El ISBN no es valido.");
                    }

                    break;

                case 2:


                    String reparar ="";

                    //Hago un trycatch para que no se pueda introducir valores incorrectos.
                    try{
                        System.out.println("Bienvenido, introduce el ISBN el cual quieres reparar.");
                        reparar = teclado.next();
                    }catch (Exception e){
                        System.out.println("Valores introducidos incorrectos");
                        break;
                    }

                    //hago esto para que este en mayusculas para que no de problemas.
                    String reparar_mayuscula = reparar.toUpperCase();

                    limite_2 = reparar_mayuscula.length();

                    //compruebo la longitud.
                    if (limite_2 > limite || limite_2 < limite){
                        System.out.println("ISBN introducido es incorrecto.");
                    }
                    //busco la primera interrogacion.
                    int posicion = reparar.indexOf("?");

                    //busco la la ultima interrogacion.
                    int posicion_1 = reparar.lastIndexOf("?");

                    //compruebo si la primera y la ultima son iguals, si no lo son se cancela el programa.
                    if (posicion != posicion_1){
                        System.out.println("ISBN introducido es incorrecto.");
                        break;
                    }

                    //hago un for para que vaya `robando con cada numero del 1 al 10.
                    for (int j = 0; j<=10; j++){
                        int suma_1 = 0;
                        boolean valido = true;

                        //hago casi lo mismo que el validadno solo que reemplazo el signo de in terrogacion por la j y luego compruebo si es divisible entre 11, si no lo es se vuelve a reiniciar hasta que encuentre un numero que permita al isbn que sea divisible entre 11.
                        for (int i = 0; i< limite_2; i++){
                            char c = reparar_mayuscula.charAt(i);
                            int valor = 0;


                            //Hago if para cambiar los distintos valores del isbn.
                            if (posicion == c){
                                valor = j;
                            }else if (c == 'X' && i == 9){
                                valor = 10;
                            }else if (c >= '0' & c <= '9' ){
                                valor = Integer.parseInt(String.valueOf(c));
                            }else{
                                System.out.println("Valores introducidos incorrectos.....");
                                valido = false;
                                break;
                            }

                            //hago la multimplicacion y la suma para saber el resultado de todo.
                            int peso = 10 - i;
                            suma_1 += valor * peso;

                        }
                        //compruebo si es divisible entre 11.
                        if (valido && suma_1 % 11 == 0 ){
                            if (j == 10 && posicion_1 == 9){
                                System.out.println("El digito que falta es X");
                            }else {
                                System.out.println("el digito que falta es " + j);
                            }
                        }
                        return;
                    }
                    break;
                    //el caso 3 es solo para salirse del programa.
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
