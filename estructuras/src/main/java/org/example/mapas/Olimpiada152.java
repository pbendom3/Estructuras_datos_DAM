package org.example.mapas;

import java.util.HashMap;
import java.util.Map;

public class Olimpiada152 {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numero = in.nextInt();
        in.nextLine();

        if (numero==0)
            return false;
        else {
            String numeros = in.nextLine();
            String[] numeros_vector = numeros.split(" ");

            Map<String,Integer> mapaNumeros = new HashMap<>();

            Integer max = 0;
            String clave_max = "0";

            for (String num : numeros_vector){

                if (mapaNumeros.containsKey(num)){
                    mapaNumeros.put(num, mapaNumeros.get(num)+1);
                }else{
                    mapaNumeros.put(num,1);
                }

                Integer actual = mapaNumeros.get(num);

                if (max < actual){
                    max = actual;
                    clave_max = num;
                }

            }

            System.out.println(clave_max);

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main


}
