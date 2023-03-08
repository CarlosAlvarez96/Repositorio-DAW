
package com.iesHlanz.Tren;

import java.util.List;
import java.util.ArrayList;


public class VagonEquipaje extends VagonPesoLimitado{
    private List<Maleta> almacen;
    
    public VagonEquipaje(int pm){
        super(pm);
        this.almacen= new ArrayList<>();
    }
    public void añadir(Maleta m){
        almacen.add(m);
        super.comprobarPesoMaximoExcedido();
    }
    public void retirar(Maleta m){
        almacen.remove(m);
    }

    @Override
    public int getPeso() {       
        int pesoMaletas = 0;
        for(Maleta i : almacen){
           pesoMaletas += i.peso();
        }
        return pesoMaletas;
    }
}
