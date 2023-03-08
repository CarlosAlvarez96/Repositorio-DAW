/*
4) Realiza un programa en el que la pantalla tenga el fondo de color azul, color del texto 
amarillo y cursor invisible. El ordenador preguntará al usuario que escriba la ruta de un 
archivo con una imagen. La pantalla pasará a tener como fondo la imagen de dicho 
archivo, que se mostrará escalada para ocupar toda la pantalla. Al pulsar una tecla, el 
programa finalizará. 
 */

import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoImagen;
import bpc.daw.consola.Teclado;
import static java.awt.Color.*;

public class FINALEST2EJ4 {

    public static void main(String[] args) {

        Consola con = new Consola();
        CapaFondo c = con.getCapaFondo();
        Fondo f = new FondoColorSólido(BLUE);
        c.setFondo(f);
        
        CapaTexto ct = con.getCapaTexto();
        ct.setColorTexto(yellow);
        
        Teclado t = con.getTeclado();
        t.setTipoCursor(Teclado.CURSOR_HUECO);
        
        System.out.println("Escriba una ruta de un archivo con una imagen");
        String fondo = t.leerCadenaCaracteres();
        Fondo fi = new FondoImagen(fondo);
        c.setFondo(fi);
        t.leerCaracter();
        
    }
}
