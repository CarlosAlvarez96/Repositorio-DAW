
package com.iesHlanz.Explicacion.Herencia;


public class Persona {
    String nombre;
    private int edad;
    public double altura;
    protected double peso;
    
    public Persona(String n, int e, double t, double p)throws IsmaelException{
        nombre=n;
        edad=e;
        if(t<0){
            throw new IsmaelException("altura negativa");
        }
         altura=t;
        peso=p;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
}
