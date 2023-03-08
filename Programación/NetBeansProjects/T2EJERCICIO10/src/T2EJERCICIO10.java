/*Ejercicio 10 : Haz otro programa que cree una caja con un mensaje cualquiera. Abrir la caja,
consultar el mensaje y mostrarlo por pantalla. Sustituir el mensaje por otro. Volver a
consultarlo y mostrar el resultado. */
import bpc.daw.objetos.*;
import java.lang.*;

public class T2EJERCICIO10 {

    public static void main(String args[]) {
        Caja box = new Caja("chanchito");
        box.abrirCaja();
        box.getMensaje();
        System.out.println(box.getMensaje());
        box.cambiarMensaje("chanchito feliz");
        System.out.println(box.getMensaje());
        
    }
}
