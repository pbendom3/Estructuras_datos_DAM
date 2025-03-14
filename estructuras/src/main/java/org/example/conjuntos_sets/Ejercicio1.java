package org.example.conjuntos_sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.print("Introduzca la frase: ");
    Scanner teclado = new Scanner(System.in);

    String frase = teclado.nextLine().toLowerCase();
    String[] palabraSplit = frase.split(" ");

    Set<String> elxavo= new TreeSet<>();

        for (int i = 0; i < palabraSplit.length; i++) {
            elxavo.add(palabraSplit[i]);
        }

        System.out.println(elxavo);
    }
}
