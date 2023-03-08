
package com.iesHlanz.Ej4yEj5;


public class Edificio {
    private String direccion;
    private int numeroPlantas;
    
    public Edificio(String d, int np){
        direccion=d;
        if(np>0){
            numeroPlantas=np;
        }else{
            throw new IllegalArgumentException("No se admiten plantas negativas");
        }
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    public int getNumeroPlantas(){
        return this.getNumeroPlantas();
    }
}
