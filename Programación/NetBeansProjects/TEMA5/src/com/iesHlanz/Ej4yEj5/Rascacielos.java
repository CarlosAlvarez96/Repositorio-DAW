
package com.iesHlanz.Ej4yEj5;

public class Rascacielos extends Edificio{
    private int altura;
    
    public Rascacielos(String d, int np, int a){
        super(d,np);
        if(a>0){
             this.altura=a;  
        }else{
             throw new IllegalArgumentException("No se admite altura inferior a 1");
        }
     
    }
    
    public int getAltura(){
        return this.altura;
    }
}
