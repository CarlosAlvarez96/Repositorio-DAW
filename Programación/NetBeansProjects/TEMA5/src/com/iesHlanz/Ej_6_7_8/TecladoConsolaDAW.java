
package com.iesHlanz.Ej_6_7_8;

import bpc.daw.consola.CapaTexto;


public class TecladoConsolaDAW implements Teclado{
        private CapaTexto ct;
        
        public TecladoConsolaDAW(CapaTexto ct){
            this.ct=ct;
        }

    @Override
    public void escribirTexto(String mensaje) {
        this.ct.print(mensaje);
    }
}
