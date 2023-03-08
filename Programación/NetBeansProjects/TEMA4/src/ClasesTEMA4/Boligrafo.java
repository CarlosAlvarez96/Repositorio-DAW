package ClasesTEMA4;

import bpc.daw.consola.CapaTexto;
import java.awt.Color;

public class Boligrafo {

    private static final Color[] COLORES = {Color.RED, Color.GREEN, Color.BLUE, Color.WHITE, Color.YELLOW};
    private int color;
    private CapaTexto ct ;    
    
    public Boligrafo(CapaTexto ct) {
        this.ct = ct;
    }

    public void setColor(int n) {
        this.color = n;
         ct.setColorTexto(COLORES[color]);
    }

    public void escribir(String texto) {
        ct.print(texto);
    }

    public void escribirGuay(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            ct.setColorTexto(COLORES[i]);
            ct.print(texto.charAt(i));
            if(color==COLORES.length){
                i=0;
            }
        }
    }
}
