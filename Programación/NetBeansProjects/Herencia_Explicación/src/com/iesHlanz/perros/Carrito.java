
package com.iesHlanz.perros;

import java.util.ArrayList;
import java.util.List;


public class Carrito {
    private List<Perro> compra;
    
    public Carrito(){
        this.compra=new ArrayList<>();
    }
    
    public void comprar(Perro p){
        compra.add(p);
    }
    
    public int getPrecio(){
        int precio=0;
        for(int i= 0; i<compra.size();i++ ){
            precio = compra.get(i).getPrecio();
        }
         if(esAbandonado()){
            precio -= (precio/100)*5;
    }
        return precio;
    }
    public boolean esAbandonado(){
         boolean hayPerroAbandonado=false;
         for(int i = 0 ; i<compra.size();i++){
                Perro pe = compra.get(i);
                if(pe instanceof PerroAbandonado a){
                    hayPerroAbandonado = a.getEnfermedades().isEmpty();
                }
            }
         return hayPerroAbandonado;
        }
       
}
