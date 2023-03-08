
package ClasesTEMA4;

import static ClasesTEMA4.tipoEquipo.LOCAL;
import static ClasesTEMA4.tipoEquipo.VISITANTE;


public class MarcadorDefinitivo implements MarcadorBaloncestoEj41{
    private Equipo local;
    private Equipo visitante;
    
    public MarcadorDefinitivo(String local, String visitante){
        this.local = new Equipo(local,0);
        this.visitante = new Equipo(visitante,0);
    }

    
    @Override
    public void añadirCanasta(tipoEquipo e, TipoCanasta t) {
        if(e==LOCAL){
            local = this.local.añadirCanasta(t);
        }else if(e==VISITANTE){
        visitante = this.visitante.añadirCanasta(t);
        }
    }

    @Override
    public String getNombreEquipo(tipoEquipo e) {
        return this.getNombreEquipo(e);
    }

    
    @Override
    public int getPuntos(tipoEquipo e) {
        return this.getPuntos(e);
    }
    
}
