
package com.iesHlanz.Ej_6_7_8;

import java.time.LocalDateTime;


public class Administrativo extends TrabajadorTecleante{
    
    public Administrativo(String nombre, int sueldo, int nDNI, char lDNI, int ppm) {
        super(nombre, sueldo, nDNI, lDNI, ppm);
    }
    
    public void escribirInforme(String t){
        this.teclado.escribirTexto(LocalDateTime.now().toString()+" "+t);
    }
}
