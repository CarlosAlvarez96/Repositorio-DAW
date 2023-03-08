
package com.iesHlanz.Ej_6_7_8;

import java.util.HashMap;
import java.util.Map;


public class Programador extends TrabajadorTecleante {
    private Map<String,String> lenguajes;

    public Programador(String nombre, int sueldo, int ndni, char ldni, int ppm) {
        super(nombre, sueldo, ndni, ldni, ppm);
        lenguajes= new HashMap<>();
    }
    
    public void aprenderLenguaje(String lenguaje,String holaMundo){
        this.lenguajes.put(lenguaje, holaMundo);
    }
    
    public String programarHolaMundo(String lenguaje){
           String codigoFuente =  lenguajes.getOrDefault(lenguaje, "LenguajeDesconocido");
           if(lenguajes.containsValue("LenguajeDesconocido")){
               throw new IllegalStateException ("No conoce el lenguaje");
           }
        return codigoFuente;
    }
    
    }

