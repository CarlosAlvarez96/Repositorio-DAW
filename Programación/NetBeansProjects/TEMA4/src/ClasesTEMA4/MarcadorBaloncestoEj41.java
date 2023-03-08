
package ClasesTEMA4;

import static ClasesTEMA4.tipoEquipo.LOCAL;
import static ClasesTEMA4.tipoEquipo.VISITANTE;


public interface MarcadorBaloncestoEj41 {
    void añadirCanasta(tipoEquipo e, TipoCanasta t);
    String getNombreEquipo(tipoEquipo e);
     int getPuntos(tipoEquipo e);
     default void mostrarMarcador(){
        System.out.println(this.getNombreEquipo(LOCAL)+" "+this.getPuntos(LOCAL)+" - "
                +this.getPuntos(VISITANTE)+this.getNombreEquipo(VISITANTE));
    }

}
