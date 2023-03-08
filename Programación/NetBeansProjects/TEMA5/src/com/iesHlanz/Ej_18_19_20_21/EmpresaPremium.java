
package com.iesHlanz.Ej_18_19_20_21;

import java.util.ArrayList;
import java.util.List;


public class EmpresaPremium implements EmpresaPaquetería{
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;
    
    public EmpresaPremium(){
        this.lento= new Transportista(50);
        this.medio = new Transportista(25);
        this.rapido= new Transportista(10);
    }

    @Override
    public void registrarPedido(Paquete p) {
        if(p.getPrioridad()==1){
            this.rapido.subirCamion(p);
        }else if(p.getPrioridad()==2){
            this.medio.subirCamion(p);
        }else if(p.getPrioridad()==3){
            this.lento.subirCamion(p);
        }
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> t = new ArrayList<>();
        t.add(medio);
        t.add(rapido);
        t.add(lento);
        return t;
    }
}
