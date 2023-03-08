
public class ControlExistencia extends Control{

    
    @Override
    public boolean aceptar(Articulo a) {
        boolean aceptado = false;
        if(a.getUnidadesDisponibles()>0){
            aceptado=true;
        }else{
            super.mensajeError="recibido un artículo con 0 unidades";
    }
        return aceptado;
    }
    
}
