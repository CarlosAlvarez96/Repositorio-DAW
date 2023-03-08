
import java.util.List;


public class ControlArticulosRepetidos extends Control{

    private List<Articulo> existencias;
    
    public ControlArticulosRepetidos(List<Articulo> e){
        this.existencias=e;
    }
    @Override
    public boolean aceptar(Articulo a) {
        boolean aceptado = false;
        if(existencias.contains(a.getDescriptor())){
        super.mensajeError="Ya hay existencias en el Artículo";
    }else{
            aceptado=true;
        }
        return aceptado;
    }
    
}
