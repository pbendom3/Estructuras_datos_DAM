package org.example.pilas;

import java.util.Stack;

public class Pilas {

    public static void ejemplo(){
        Stack<Integer> pila =  new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(34);
        pila.push(2);

        System.out.println(pila.peek());

        System.out.println();
        for (Integer nums : pila){
            System.out.println(nums);
        }

        System.out.println();
        pila.pop();
        System.out.println(pila.peek());

        System.out.println();
        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }

        pila.empty();
    }

    public static void ejercicio3(){

       String expresion = "))()()()";

       if (esBalanceado(expresion)){
           System.out.println("los paréntesis están bien cerrados");
       }else{
           System.out.println("los paréntesis no están bien cerrados");
       }

    }

    public static boolean esBalanceado(String expresion){

        Stack<String> pila = new Stack<>();
        String[] expresion_vector = expresion.split("");

        for (int i = 0; i < expresion_vector.length; i++) {
            if (expresion_vector[i].equals("(") || (expresion_vector[i].equals(")") && !pila.contains("("))){
                pila.push(expresion_vector[i]);
            } else if (expresion_vector[i].equals(")") && pila.contains("(")) {
                pila.pop();
            }
        }

        if(pila.isEmpty()){
            return true;
        }else{
            return false;
        }


    }





}
