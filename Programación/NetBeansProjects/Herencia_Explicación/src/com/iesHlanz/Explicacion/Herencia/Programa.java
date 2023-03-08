package com.iesHlanz.Explicacion.Herencia;

import com.iesHlanz.Sistema.Ordenador;

public class Programa {

    public static void main(String[] args) throws IsmaelException {
        /*Persona e = new Empleado("Ismael",18,2,80,2000);
        e.nombre="Antonio"; //funciona, protected, clase hija
        //e.edad=90; este da error, es private
        e.altura = 2.2; // Funciona, es public
        e.peso=235; // Protected, funciona en mismo paquete y clases hijas. (Esto solo en java)*/

        //Usando la Exception de la clase IsmaelException
        /*try {
            Persona p = new Persona("antonio", 20, -8, 50);
        } catch (IsmaelException error) {
            System.out.println(error.getMessage());
        }*/

        //Usando la RuntimeException de la clase YerayException
        Ordenador o = new Ordenador(4,"windows","hp");
        o.abrirNavegador();
    }
}
