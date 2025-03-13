package org.example.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

    public static void main(String[] args) {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Mirror - Justin Timberlake");
        playlist.offer("Toxic - Britney Spears");
        playlist.offer("Clavaito - Chanel feat. Abraham Mateo");
        playlist.offer("La reina - Lola Índigo");

        System.out.println("Estado inicial de la playlist: " + playlist);

        while(!playlist.isEmpty()){

            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la playlist después de reproducir la canción: " + playlist);

        }

        System.out.println("La playlist ha terminado");

    }
}
