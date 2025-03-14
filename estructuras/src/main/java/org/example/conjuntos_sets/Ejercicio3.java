package org.example.conjuntos_sets;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Set<String> historial = new LinkedHashSet<>();
        int i = 1;

        while(true) {

            System.out.println("Introduzca una pagina(o salir para acabar):");
            String pagina = entrada.next();

            if (pagina.equalsIgnoreCase("salir")) {
                break;
            }else{
                historial.add(pagina);
            }
        }

        System.out.println("Mostrando hsitorial:");

        for(String s : historial) {
            System.out.println(i + ". " + s);
            i++;
        }
    }
}
