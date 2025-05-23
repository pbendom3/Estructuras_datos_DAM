package org.example.equals_hashcode;

import java.util.Objects;

public class Paciente {

    private String sip;
    private String nombre;
    private String apellidos;

    public Paciente(String sip, String nombre, String apellidos){
        this.sip=sip;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        //xavi.equals(javi);
        return Objects.equals(sip, paciente.sip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, nombre, apellidos);
    }



}
