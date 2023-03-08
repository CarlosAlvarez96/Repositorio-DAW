
package com.iesHlanz.Ej_18_19_20_21;

import java.util.ArrayList;
import java.util.List;


public class Transportista {
    protected List<Paquete> paquetes;
    private long tiempoEntrega;
    
    public Transportista(long te){
        this.tiempoEntrega=te;
        this.paquetes=new ArrayList<>();
    }
    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }
    public void enviar() {
        for(int i =0; i<paquetes.size();i++){
            Paquete p = paquetes.get(i);
            try{
            Thread.sleep(tiempoEntrega*60000);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println("El paquete "+p.getProducto()+ " con prioridad "+p.getPrioridad()+" ha llegado a: "+p.getDireccionDestino());
        }
        paquetes.clear();
    }
}
