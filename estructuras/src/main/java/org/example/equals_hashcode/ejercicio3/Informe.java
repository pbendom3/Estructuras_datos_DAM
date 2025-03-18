package org.example.equals_hashcode.ejercicio3;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Informe {

    private int codigo;
    private String descripcion;
    private Tipos tipo;

    public Informe (int codigo,String descripcion,Tipos tipo){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }


}
