
package com.iesHlanz.Ej_6_7_8;


public class Trabajador {
    private String dni;
    private String nombre;
    protected int sueldo;
    
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
        this.nombre=nombre;
        this.sueldo=sueldo;
        this.dni= Integer.toString(numDNI)+letraDNI;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getDNI(){
        return dni;
    }
}
