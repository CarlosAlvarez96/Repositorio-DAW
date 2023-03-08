
public class ControlCaducidad extends Control {

    @Override
    public boolean aceptar(Articulo a) {
        boolean aceptado = false;
        if (a instanceof ProductoCaducable pc) {
            if (pc.estaCaducado()) {
            } else {
                aceptado=true;
            }
        }else{
            aceptado=true;
    }
        if(aceptado=false){
            super.mensajeError="Producto caducado";
        }
        return aceptado;
}

}
