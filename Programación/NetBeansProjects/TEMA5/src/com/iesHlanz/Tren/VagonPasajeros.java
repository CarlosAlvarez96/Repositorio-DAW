
package com.iesHlanz.Tren;

import java.util.List;

public class VagonPasajeros extends VagonPesoLimitado{

    private List<Persona> personas;
    
    public VagonPasajeros(int pm){
        super(pm);
        this.personas=new ArrayList<>();
    }
    /*public void subir(Persona p){
        this.personas.add(p);
        if(p.getMaleta() != null){
            
        }
    }
    public void bajar(Persona p){
        
    }
    @Override
    public int getPeso() {

    }*/
    
}
