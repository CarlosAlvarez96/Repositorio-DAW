
package com.iesHlanz.Trabajadores;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;


public class TecladoConsolaDAW implements Teclado{
   private CapaTexto ct;
   
   
   public TecladoConsolaDAW(CapaTexto ct){
       this.ct=ct; 
   }

    @Override
    public void escribirTexto(String mensaje) {
        ct.print(mensaje);
    }
}
