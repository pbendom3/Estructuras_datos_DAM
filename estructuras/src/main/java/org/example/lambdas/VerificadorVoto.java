package org.example.lambdas;

@FunctionalInterface
public interface VerificadorVoto {

    boolean puedeVotar(String nombre, int edad);

}
