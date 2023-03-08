
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import java.awt.Graphics;

public class csd {

    public static void main(String args[]) {
        
        try {
        Consola c = new Consola();
        CapaCanvas cc = c.getCapaCanvas();
        Graphics g = cc.getGraphics();
        g.drawOval(90, 90, 200, 200);
            Thread.sleep(10000);
        } catch (InterruptedException ed) {
            System.out.println(ed);
        }
    }
}
