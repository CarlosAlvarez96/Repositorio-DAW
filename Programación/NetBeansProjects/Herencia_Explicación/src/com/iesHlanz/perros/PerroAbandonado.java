
package com.iesHlanz.perros;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class PerroAbandonado extends Perro{
    private Set<String> enfermedades;
    
    public PerroAbandonado(String n,int p,String r){
        super(n,p,r);
        this.enfermedades= new HashSet<>();
        this.rellenarEnfermedadesAleatoriamente();
    }
    
    private void rellenarEnfermedadesAleatoriamente(){
        String [] enfermedadesPosibles = {
            "rabia","sarna","pulgas","covid"
        };
        Random ran = new Random();
        int numeroEnfermedades = ran.nextInt(enfermedadesPosibles.length);
        for(int i = 0; i < numeroEnfermedades;i++){
            int enfermedad = ran.nextInt(enfermedadesPosibles.length);
            enfermedades.add(enfermedadesPosibles[enfermedad]);
        }
    }
    public Set<String> getEnfermedades(){
        return this.enfermedades;
    }
    
    public boolean PerroSano(){
        return enfermedades.isEmpty();
    }
}
