package org.example.equals_hashcode.ejercicio3;

import java.util.HashSet;
import java.util.Stack;

public class AppFuncionario {

    static Stack<Informe> pilaInformes = new Stack<>();
    static HashSet<Informe> listaInformesPorTipo = new HashSet<>();

    public static void main(String[] args) {

        pilaInformes.push(new Informe(1,"Grapar documentos",Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1,"Atender llamadas",Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2,"Ir a por folios",Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1,"Llamar a casa",Tipos.PERSONAL));
        pilaInformes.push(new Informe(2,"Comprar pan",Tipos.PERSONAL));

        while(!pilaInformes.isEmpty()){
            System.out.println("Despachando..." + pilaInformes.pop());
        }

        pilaInformes.push(new Informe(1,"Grapar documentos",Tipos.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1,"Grapar documentos",Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(1,"Atender llamadas",Tipos.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1,"Atender llamadas",Tipos.ADMINISTRATIVO));
        pilaInformes.push(new Informe(2,"Ir a por folios",Tipos.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(2,"Ir a por folios",Tipos.ADMINISTRATIVO));

        System.out.println();

        for (int i = pilaInformes.size()-1; i >= 0; i--) {
            System.out.println(pilaInformes.get(i));
        }

        System.out.println("Tienes " + listaInformesPorTipo.size() + " tipos de tareas distintas");

        pilaInformes.pop();





    }



}
