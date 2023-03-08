
package com.iesHlanz.Ejercicio_31;

public class EfectoInverso implements Simetrico,EfectoEspecial{
    protected EfectoInverso(){
    }

    @Override
    public String getNombre() {
        return TipoEfecto.INVERSO.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
    return new StringBuilder(frase).reverse().toString();
  }    
}
