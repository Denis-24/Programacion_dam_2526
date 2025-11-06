package org.example;

public class ejercicio_6_vectores {
    static void main() {
        int vector[] = {1,2,3,2,1};
        boolean es_o_no = true;

        for (int i=0;i<vector.length/2;i++){
            vector[i]=vector[vector.length-1-i];
            if (vector[i]!=vector[vector.length-1-i]){
                System.out.println("No esas");
                es_o_no=false;
                break;
            }
        }
        if (es_o_no) System.out.println("Es palindromo");
    }
}
