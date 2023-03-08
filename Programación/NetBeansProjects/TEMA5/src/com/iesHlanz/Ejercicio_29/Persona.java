
package com.iesHlanz.Ejercicio_29;

import java.util.List;


public record Persona(String nombre, int edad, boolean soltero) implements Filtro{
    public static void mostrarEnPantalla(List<Persona>personas,Filtro filtro){
        
    }

    @Override
    public boolean aceptarPersona() {
        
    }
}
