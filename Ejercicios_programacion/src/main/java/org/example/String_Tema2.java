package org.example;

public class String_Tema2 {

    static void main() {

        String frase = "Al palo JuanFran del Atleti palo";

        int tamaño = frase.length();
        System.out.println(tamaño);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo",10 );
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_mayuscula = frase.toUpperCase();
        System.out.println(frase_mayuscula);

        String frase_minuscula = frase.toLowerCase();
        System.out.println(frase_minuscula);

        String base_datos = "Raul                ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.equals("Manolo");
        System.out.println(igual);

        boolean igual2 = base_datos.trim().equals("Raul");
        System.out.println(igual2);

        boolean igual_sin_mayusculas = base_datos.trim().equalsIgnoreCase("raul");
        System.out.println(igual_sin_mayusculas);

        String frase_remplazo = frase.replace("palo", "Florentino");
        System.out.println(frase_remplazo);



    }
}
