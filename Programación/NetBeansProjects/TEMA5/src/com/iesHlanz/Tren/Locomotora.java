 package com.iesHlanz.Tren;

import java.util.List;
import java.util.ArrayList;

public class Locomotora extends Vagon{
    public Locomotora(){
        
    }
    public void enganchar(Vagon V){
        if(V instanceof Locomotora l){
            throw new IllegalArgumentException ("Solo puede haber una locomotora");
        }else{
            super.enganchar(V);
        }
    }
    /*public int getNumeroVagonesTren(){
        int contador = 0;
        boolean repetir=true;
        super.g
        while(repetir){
            
        }
        
        
        return contador;
    }*/
    public int getPesoTren(){
        int peso =0;
        boolean repetir=true;
        peso+= this.getPeso();
        Vagon siguienteVagon = super.getVagonSiguiente();
        while(repetir){
            if(siguienteVagon==null){
                repetir=false;
            }else{
                peso+= siguienteVagon.getPeso();
            }
        
    }
        return peso;
        
    public void arrancar(){
        if(getPesoTren()<145600){
            System.out.println("Tren en marcha");
        }else{
            throw new IllegalStateException ("La locomotora no puede tirar del tren");
        }
    }

    @Override
    public int getPeso() {
        return 76400;
    }
}

