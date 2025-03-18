package org.example;

import org.example.pilas.Pilas;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Pilas.ejercicio3();

        HashMap<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"PC701");
        mapa.put(2,"PC002");

        System.out.println(mapa.get(1));
        System.out.println(mapa.keySet());

        for (Integer clave : mapa.keySet()){
            System.out.println(clave);
        }



    }
}