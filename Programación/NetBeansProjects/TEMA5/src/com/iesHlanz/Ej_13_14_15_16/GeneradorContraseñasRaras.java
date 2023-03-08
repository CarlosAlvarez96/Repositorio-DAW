
package com.iesHlanz.Ej_13_14_15_16;

import java.util.Random;


public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas{
    
    public GeneradorContraseñasRaras(){
        
    }
    
    public GeneradorContraseñasRaras(Random r){
        super(r);
    }
    
    @Override
    public String generarContraseña(int longitud){
        GeneradorContraseñas g = new GeneradorContraseñas();
        String psw = g.generarContraseña(longitud);
        for(int i=0;i<psw.length();i++){
            char a = psw.charAt(i);
            int ascii = (int) a + 122;
            a = (char) ascii;
        }
        return psw;
    }
}
