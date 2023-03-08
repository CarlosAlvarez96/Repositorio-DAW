
package com.iesHlanz.Trabajadores;


public class TecladoJava implements Teclado{
    public TecladoJava(){
        
    }

    @Override
    public void escribirTexto(String mensaje) {
        System.out.println(mensaje);
    }
}
