
public abstract class Control {
    protected String mensajeError;
    
    public Control(){
        this.mensajeError=null;
    }

    public String getMensajeError() {
        return mensajeError;
    }
    //Ejercicio de teoria: El siguiente método abstracto es un ejemplo de polimorfismo
    //La principal ventaja es que en función de la clase hija el método hace una cosa distinta
    //Si no pudiesemos hacer esto, tendriamos que hacer un método distinto para cada uno,
    //en su lugar, el programador de aplicaciones podra usar el mísmo método para todo y esto hace
    //que el codigo tenga mejor mantenimiento y ampliación
    public abstract boolean aceptar(Articulo a);
    
    
}
