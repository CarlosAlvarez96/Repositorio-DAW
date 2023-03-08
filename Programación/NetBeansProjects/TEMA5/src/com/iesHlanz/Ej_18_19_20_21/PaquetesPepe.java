
package com.iesHlanz.Ej_18_19_20_21;

import java.util.ArrayList;
import java.util.List;

public class PaquetesPepe implements EmpresaPaquetería{
    private TransportistaOrdenado pepe;
    
    public PaquetesPepe(){
        this.pepe=new TransportistaOrdenado(30);
    }
    public void registrarPedido(Paquete p){
        this.pepe.subirCamion(p);
    }
    public List<Transportista> getTransportistas(){
        List<Transportista> t = new ArrayList<>();
        t.add(pepe);
        return t;
    }
}

