
import bpc.daw.consola.*;
import bpc.daw.consola.Fondo;
import static java.awt.Color.RED;
import java.util.Scanner;

/*
2) Hacer un programa que pregunte al usuario por teclado tres números R, G y B 
comprendidos entre 0 y 255 y ponga la pantalla con el color de fondo definido por los 
números R, G y B. El programa terminará al pulsar una tecla (esto se hace simplemente 
pidiendo un carácter e ignorándolo). 
 */
public class FINALEST2EJERCICIO2 {

    public static void main(String args[]) {
        Consola con = new Consola();
        CapaFondo c = con.getCapaFondo();
        Teclado t = con.getTeclado();
        t.activarEco(true);
        t.setTipoCursor(Teclado.CURSOR_LINEA);
        System.out.println("Introduzca un número entre 0 y 255 para r");
        int r = t.leerNumeroEntero();
        System.out.println("Introduzca un número entre 0 y 255 para g");
        int g = t.leerNumeroEntero();
        System.out.println("Introduzca un número entre 0 y 255 para b");
        int b = t.leerNumeroEntero();

        Fondo f = new FondoColorSolido(r, g, b);
        c.setFondo(f);
        t.activarEco(false);
        t.leerCaracter();

    }
}


