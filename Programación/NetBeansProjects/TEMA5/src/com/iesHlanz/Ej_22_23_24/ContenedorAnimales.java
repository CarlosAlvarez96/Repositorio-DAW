
package com.iesHlanz.Ej_22_23_24;

import java.util.HashSet;
import java.util.Set;


public abstract class ContenedorAnimales {
    protected Set<Animal> animales;
    
    public  ContenedorAnimales(){
        this.animales= new HashSet();
    }
    
    public boolean añadir(Animal a){
        boolean añadido = false;
        if(comprobarDisponibilidadPlaza(a)){
            this.animales.add(a);
            añadido = true;
            a.setEncerrado(true);
        }
        return añadido;
    }
    
    public boolean retirar(Animal a){
        boolean noEsta=false;
        if(this.animales.contains(a)){
            this.animales.remove(a);
        }else{
            noEsta=true;
        }
        return noEsta;
    }
    
    public int getPesoActual(){
        int pesoAnimales = 0;
        for(Animal i : animales){
            pesoAnimales += i.getPeso();
        }
        return pesoAnimales;
    }
    
    public int getNumeroAnimales(){
        return this.animales.size();
    }
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
