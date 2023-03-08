
package com.iesHlanz.Tren;


public abstract class VagonPesoLimitado extends Vagon{
    private int pesoMaximo;
    
    public VagonPesoLimitado(int pm){
        if(pm <=0){
            throw new IllegalArgumentException("El peso máximo debe ser positivo");
        }else{
            this.pesoMaximo=pm;
        }
    }
    public int getPesoMaximo(){
        return this.pesoMaximo;
    }
    protected void comprobarPesoMaximoExcedido(){
        
    }
}
