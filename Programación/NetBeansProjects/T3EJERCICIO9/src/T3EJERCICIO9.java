
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.util.Random;

/*
Ejercicio 9: Usa la Consola DAW para realizar un programa que pregunte al usuario "¿Cuántos 
círculos desea dibujar?". El usuario escribirá un número entero (si el número es incorrecto o 
negativo, el programa dirá "Número incorrecto" y finalizará sin hacer nada más) y la pantalla 
se borrará y se dibujarán tantos círculos como haya indicado el usuario. Cada círculo tendrá un 
color con valores RGB aleatorios entre 0 y 255, y sus coordenadas también serán aleatorias 
entre (0,0) y la resolución de la pantalla
 */
public class T3EJERCICIO9 {

    public static void main(String args[]) {
        Consola con = new Consola();
        CapaTexto ct = con.getCapaTexto();
        CapaCanvas cc = con.getCapaCanvas();
        Teclado t = con.getTeclado();
        Graphics2D g2d = cc.getGraphics2D();
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        ct.println("¿Cuántos cículos desea dibujar?");
        int c = t.leerNumeroEntero();
        if (c < 0 || c != (int)c) {
            ct.println("Número incorrecto");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } else {
            for (int i = 0; i != c; i++) {
                ct.cls();
                int y = new Random().nextInt(d.height);
                int x = new Random().nextInt(d.width);
                int r = (int) (Math.random() * 255 + 0);
                int g = (int) (Math.random() * 255 + 0);
                int b = (int) (Math.random() * 255 + 0);
                Color col = new Color(r, g, b);
                g2d.setColor(col);
                g2d.drawOval(x, y, 50, 50);

            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
