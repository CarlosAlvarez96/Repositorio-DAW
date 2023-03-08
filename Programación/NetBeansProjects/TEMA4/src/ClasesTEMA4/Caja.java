package ClasesTEMA4;

public class Caja {

    public boolean abierto;
    public String mensaje;

    public Caja(String m) {
        mensaje = "Hola mundo";
        abierto = false;
    }

    public Caja(Boolean a, String m) {
        abierto = true;
        mensaje = "Hola mundo";
    }
    
    public Caja(){
        mensaje="Viva el tema 7";
    }
    /*--------------------------------Ejercicio 13------------------------------*/
    public void abrir(){
        abierto=true;
    }
    public void cerrar(){
        abierto=false;
    }
    public String getMensaje(){
        String mensajeDevuelto = " ";
        if(!abierto){
            mensajeDevuelto=null;
        }else{
            mensajeDevuelto=mensaje;
        }
        return mensajeDevuelto;
    }
}
