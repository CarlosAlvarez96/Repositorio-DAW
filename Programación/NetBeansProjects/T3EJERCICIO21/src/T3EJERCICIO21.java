
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Toolkit;

/*
Ejercicio 21: Usa la Consola DAW para hacer un programa que pregunte al usuario un número 
de segundos. El programa finalizará cuando pase la cantidad de segundos introducida y 
durante ese tiempo se dibujará y actualizar en la pantalla una barra de progreso como esta: 

 */
public class T3EJERCICIO21 {

    public static void main(String args[]) {
        Consola con = new Consola();
        CapaTexto ct = con.getCapaTexto();
        CapaCanvas cc = con.getCapaCanvas();
        Graphics2D g = cc.getGraphics2D();
        Teclado t = con.getTeclado();
        Color col = new Color(0,0, 0);
        
        ct.print("Introduzca un número de segundos:");
        int tiempo = t.leerNumeroEntero();
        g.setColor(col);
        g.drawRect(100, 160, 400, 320);
        try {
            Thread.sleep(tiempo*1000);
        } catch (InterruptedException e) {
            System.out.println("Error " + e);
        }
        
    }
}
