package org.example.equals_hashcode.ejercicio2;

import lombok.Getter;

@Getter
public class Persona {

    private int edad;

    public Persona(int edad){
        this.edad=edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }



}
