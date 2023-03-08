
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import java.awt.Graphics;


public class xjsqbjx {
    public static void main(String args[]) {
        Consola c= new Consola ();
        CapaCanvas cc = c.getCapaCanvas();
        Graphics g = cc.getGraphics();
        int contador = 0;
        for (int i = 0; i<100;i++){
            g.drawOval(300+contador, 200, 15, 15);
            contador+=20;
        }
        try{
           Thread.sleep(10000); 
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        
    }
}
