
package com.iesHlanz.Ej4yEj5;

import java.util.ArrayList;
import java.util.List;


public class Hotel extends Edificio {
    private List<String> clientes;
    private int maximo;
    
    public Hotel(String d, int np, int m){
        super(d,np);
        clientes = new ArrayList<>();
        if(m>0){
         maximo=m;        
        }
        throw new IllegalArgumentException("Cantidad máxima de personas negativa");

    }
    
    public void añadirCliente(String c){
        if(clientes.size()==this.maximo){
        clientes.add(c);
        }else{
            throw new IllegalArgumentException("La lista está completa");
        }
    }
    public void retirarCliente(String c){
        if(clientes.contains(c)){
        clientes.remove(c);
        }else{
            throw new IllegalArgumentException("El cliente no está en el hotel");
        }
    }
}
