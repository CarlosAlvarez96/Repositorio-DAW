
package com.iesHlanz.Ej_13_14_15_16;

import java.util.Random;


public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    
    public GeneradorContraseñasInvertidas(){
        
    }
    
    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    }
    
    @Override
    public String generarContraseña(int longitud){
        GeneradorContraseñas g = new GeneradorContraseñas();
        String psw = g.generarContraseña(longitud);
        for(int i=0;i<psw.length();i++){
            char a = psw.charAt(i);
            if(Character.isUpperCase(a)){
                Character.toLowerCase(a);
            }else{
                Character.toLowerCase(a);
            }
        }
        return psw;
    }
}
