
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import java.awt.Graphics;

public class EXAMENT2REPASO {

    public static void main(String args[]) {
        Consola consola = new Consola();
        CapaCanvas cc = consola.getCapaCanvas();
        Graphics g = cc.getGraphics();
        g.drawRect(200, 300, 555, 333);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
