
package com.iesHlanz.Tren;


public abstract class Vagon implements Pesado{
    private Vagon vagonSiguente;
    private Vagon vagonAnterior;
    
    public void enganchar(Vagon v){
        this.vagonSiguente=v;
    }
    public Vagon getVagonSiguiente(){
        return this.vagonSiguente;
    }
    public Vagon getVagonAnterior(){
        return this.vagonAnterior;
    }
    public abstract int getPeso();
}
