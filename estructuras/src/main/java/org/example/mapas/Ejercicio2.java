package org.example.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce una palabra...");
        String palabra = teclado.nextLine();

        Map<Character,Integer> mapaLetras =  new HashMap<>();

        for (Character letra : palabra.toCharArray()){
            mapaLetras.put(letra,mapaLetras.getOrDefault(letra,0)+1);
            // mapaPalabras.put(palabra,mapaPalabras.get(palabra)+1);
        }

        for (Map.Entry<Character,Integer> letra : mapaLetras.entrySet()){
            System.out.println(letra.getKey() + ": " + letra.getValue());
        }



    }
}
