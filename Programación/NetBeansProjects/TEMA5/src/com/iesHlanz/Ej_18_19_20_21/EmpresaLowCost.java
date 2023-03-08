
package com.iesHlanz.Ej_18_19_20_21;

import java.util.ArrayList;
import java.util.List;


public class EmpresaLowCost implements EmpresaPaquetería{
    private Transportista[] Transportistas;
    private int siguienteTransportista;
    
    public EmpresaLowCost(int n){
        this.Transportistas = new Transportista[n];
        for(int i = 0; i<Transportistas.length;i++){
            Transportistas[i]= new Transportista((int)Math.random()*(80-40+1)-40);
            this.siguienteTransportista=i+1;
        }
    }

    @Override
    public void registrarPedido(Paquete p) {
        this.Transportistas[this.siguienteTransportista].subirCamion(p);
        this.siguienteTransportista++;
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> t = new ArrayList<>();
        for(int i=0;i<this.Transportistas.length;i++){
            t.add(this.Transportistas[i]);
        }
        return t;
    }
}

