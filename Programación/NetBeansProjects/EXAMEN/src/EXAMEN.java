
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;



public class EXAMEN {

    public static void main(String args[])  {
        Consola con = new Consola();
        CapaCanvas canvas = con.getCapaCanvas();
        CapaFondo fondo = con.getCapaFondo();
        CapaTexto texto = con.getCapaTexto();
        CapaSprites sprites = con.getCapaSprites();
        Graphics graficos = canvas.getGraphics();
        texto.setColorTexto(Color.yellow);
        texto.setColorFondo(Color.GREEN);
        texto.print(10,17, "Bienvenidos al instituto");
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
