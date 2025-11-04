package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

public class vectores {
    static void main() {
        int vector[] = {1,4,8,3,9};

        String vectorstring[] = {"angel","Denis","Adrian"};

        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);

        vector[0] = 7;
        vector[2] = 6;

        String vector2[] = new String[10];
        System.out.println(Arrays.toString(vector2));

        //vector = vector2.clone();

        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
        System.out.println("---");
        for (int j=vector.length-1;j>=0;j--){
            System.out.println(vector[j]);
        }
    }
}
