
import bpc.daw.objetos.*;

public class T2EJERCICIO11 {
    public static void main(String args[]) {
        Caja caja1=new Caja("chanchito");
        Caja caja2=new Caja("feliz");
        String mensajeC1= caja1.getMensaje();
        String mensajeC2 = caja2.getMensaje();
        caja1.cambiarMensaje(mensajeC2);
        caja2.cambiarMensaje(mensajeC2);
        System.out.println(caja1.getMensaje());
        System.out.println(caja2.getMensaje());
    }
}