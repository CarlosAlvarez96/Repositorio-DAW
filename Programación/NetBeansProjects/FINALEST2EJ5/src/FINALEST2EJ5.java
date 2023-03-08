
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.Teclado;
import java.awt.Rectangle;

/*
5) Realiza un programa que dibuje en la pantalla la siguiente imagen: 
 */
public class FINALEST2EJ5 {
    public static void main(String args[]) {
        Consola con = new Consola();
        
        CapaFondo cf = con.getCapaFondo();
        Fondo azul =  new FondoColorSólido(0,0,255);
        
        Teclado t = con.getTeclado();
        t.setTipoCursor(Teclado.CURSOR_HUECO);
        
        CapaCanvas cc = con.getCapaCanvas();
        Rectangle r = new Rectangle(0,400,640,80);
        
    }
}
