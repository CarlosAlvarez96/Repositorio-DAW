
package ClasesTEMA4;

import static ClasesTEMA4.TipoCanasta.CANASTA_NORMAL;
import static ClasesTEMA4.TipoCanasta.TIRO_LIBRE;
import static ClasesTEMA4.TipoCanasta.TRIPLE;
import static ClasesTEMA4.tipoEquipo.LOCAL;
import static ClasesTEMA4.tipoEquipo.VISITANTE;


public class MarcadorFacil implements MarcadorBaloncestoEj41 {

    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    public MarcadorFacil(String local, String visitante){
        this.nombreEquipoLocal=local;
        this.nombreEquipoVisitante=visitante;
        this.puntosLocal=puntosLocal;
        this.puntosVisitante=puntosLocal;
    }
    
    @Override
    public void añadirCanasta(tipoEquipo e, TipoCanasta t) {
        if(e==LOCAL){
            if(t==TIRO_LIBRE){
                this.puntosLocal+=1;
            }else if(t==CANASTA_NORMAL){
                this.puntosLocal+=2;
            }else if(t==TRIPLE){
                this.puntosLocal+=3;
            }
        }else if(e==VISITANTE){
            if(t==TIRO_LIBRE){
                this.puntosVisitante+=1;
            }else if(t==CANASTA_NORMAL){
                this.puntosVisitante+=2;
            }else if(t==TRIPLE){
                this.puntosVisitante+=3;
            }
        }
        
    }

    @Override
    public String getNombreEquipo(tipoEquipo e) {
        return e==LOCAL? this.nombreEquipoLocal : this.nombreEquipoVisitante;
    }

    @Override
    public int getPuntos(tipoEquipo e) {
        return e==LOCAL? this.puntosLocal : this.puntosVisitante;
    }
    
    

}
