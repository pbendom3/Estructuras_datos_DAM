package org.example.mapas.ejercicio3;

public class AppTemperaturas {

    public static void main(String[] args) {

        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertarTemperatura("Alicante",32);
        System.out.println(registro);
        registro.actualizarTemperatura("Alicante");
        System.out.println(registro);
        registro.consultarTemperatura();
        System.out.println(registro);
        registro.insertarTemperatura("Torrellano",30);
        registro.insertarTemperatura("Santa Pola",34);
        registro.mostrar();


    }
}
