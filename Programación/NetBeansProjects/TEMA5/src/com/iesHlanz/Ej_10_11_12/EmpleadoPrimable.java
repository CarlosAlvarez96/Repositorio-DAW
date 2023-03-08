
package com.iesHlanz.Ej_10_11_12;


public class EmpleadoPrimable extends Empleado{
    private boolean primado;
    
    public EmpleadoPrimable(String n, double s){
        super(n,s);
        primado=false;
    }
    
    public void primar(){
        primado=true;
    }
    public boolean esPrimado(){
            return primado;
    }
}
