
package com.iesHlanz.Ej_18_19_20_21;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TransportistaOrdenado extends Transportista{
    protected List<Paquete> paquetes;
    private long tiempoEntrega;
    public TransportistaOrdenado(long te) {
        super(te);
    }

    @Override
    public void enviar() {
        Collections.sort(paquetes);
        super.enviar();
    }
}
