
package com.iesHlanz.Ej_6_7_8;


public class TrabajadorTecleante extends Trabajador{
    
    private int pulsacionesMinuto;
    protected Teclado teclado;
    
    public TrabajadorTecleante(String nombre, int sueldo, int nDNI, char lDNI,int ppm) {
        super(nombre, sueldo, nDNI, lDNI);
        this.pulsacionesMinuto=ppm;
        this.teclado=null;
    }
    public void setTeclado(Teclado t){
        this.teclado=t;
    }

    public int getPulsacionesMinuto() {
        return pulsacionesMinuto;
    }
    public Teclado getTeclado(){
        return this.teclado;
    }
    
}
