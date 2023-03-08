
package com.iesHlanz.Colegio;

public abstract class EmpleadoColegio implements CalificacionListener{
    private String nombre;
    private String colegio;
    
    public EmpleadoColegio(String n, String c){
        this.colegio=c;
        this.nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public String getColegio(){
        return colegio;
    }
}
