
package com.iesHlanz.Ejercicio_31;

public class EfectoGuiones implements EfectoEspecial{
    protected EfectoGuiones(){
        
    }

    @Override
    public String getNombre() {
        return TipoEfecto.GUIONES.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.replace(" ","_");
    }
}
