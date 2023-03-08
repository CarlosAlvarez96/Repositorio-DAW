
package com.iesHlanz.Ej_6_7_8;


public class TecladoJava implements Teclado{
    //Constructor por defecto, no es necesario ponerlo
    public TecladoJava(){
    }

    @Override
    public void escribirTexto(String mensaje) {
        System.out.println(mensaje);
    }
}
