/*Ejercicio 9 : En la librería ObjetosSencillos.jar se encuentra la clase Caja. Haz un programa que
cree una caja que contenga el mensaje “Bienvenidos al instituto”. Consultar el mensaje con la
caja cerrada y mostrar el resultado. Abrir la caja y consultar el mensaje. Mostrar el resultado. */
import bpc.daw.objetos.*;
import java.lang.*;
public class T2EJERCICIO9 {
    public static void main(String args[]) {
        Caja c= new Caja("Bienvenidos al instituto");
        String cerrada = c.getMensaje();
        System.out.println(cerrada);
        c.abrirCaja();
        String abierta = c.getMensaje();
        System.out.println(abierta);
    }
}
