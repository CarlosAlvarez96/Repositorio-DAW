
package com.iesHlanz.Ejercicio_31;


public class EfectoMayusculas implements EfectoEspecial{
    protected EfectoMayusculas(){
    }

    @Override
    public String getNombre() {
        return TipoEfecto.MAYÚSCULAS.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        String fraseModificada=frase;
        return fraseModificada.toUpperCase();
    }
}
