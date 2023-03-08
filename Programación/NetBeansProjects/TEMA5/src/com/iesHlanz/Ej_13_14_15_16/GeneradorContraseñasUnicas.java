
package com.iesHlanz.Ej_13_14_15_16;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorContraseñasUnicas extends GeneradorContraseñas{
    private Set<String> contraseñasGeneradas;
    
    public GeneradorContraseñasUnicas(){
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    public GeneradorContraseñasUnicas(Random r){
        super(r);
    }
    
    @Override
    public String generarContraseña(int longitud){
        
           return this.generarContraseña(12);
           
    }
    
    @Override
    public String generarContraseña(){
           GeneradorContraseñas g = new GeneradorContraseñas();
           String contraseña = " ";
           boolean repetir= true;
           while(repetir){
                contraseña = g.generarContraseña();
               if(this.contraseñasGeneradas.contains(contraseña)){
                   repetir=false;
               }else {
                   this.contraseñasGeneradas.add(contraseña);
               }

           }
        return contraseña;
    }
}
