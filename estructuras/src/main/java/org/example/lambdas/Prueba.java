package org.example.lambdas;

public class Prueba {

    public static void main(String[] args) {

//        Pruebator pruebator = new Pruebator() {
//            @Override
//            public String prueba(String texto) {
//                System.out.println("Hola desde " + texto);
//                return texto.toUpperCase();
//            }
//        };

        Pruebator lambda = (numero) -> {return numero > 10;};

        System.out.println("Mirando el número 8: " + lambda.prueba(8) );
        System.out.println("Mirando el número 19: " + lambda.prueba(19) );

        VerificadorVoto verificar = (nombre,edad) -> {
            return edad >=18;
        };

        if (verificar.puedeVotar("Manuel",21)){
            System.out.println("Manuel puede votar");
        }else{
            System.out.println("Manuel no puede votar");
        }


//        String resultado_anonima = pruebator.prueba("una clase anónima");
//        String resultado_lambda = lambda.prueba("una lambda");
////        System.out.println(resultado_anonima);
//        System.out.println(resultado_lambda);



    }
}
