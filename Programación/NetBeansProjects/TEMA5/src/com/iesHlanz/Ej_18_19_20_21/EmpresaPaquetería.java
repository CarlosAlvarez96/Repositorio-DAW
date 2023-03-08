
package com.iesHlanz.Ej_18_19_20_21;

import java.util.List;


public interface EmpresaPaquetería {
        public void registrarPedido(Paquete p);
        public List<Transportista> getTransportistas();
        public default void enviarPaquetes(){
        List <Transportista> t = this.getTransportistas();
        for(int i=0;i<t.size();i++){
            t.get(i).enviar();
        }
    }
}
