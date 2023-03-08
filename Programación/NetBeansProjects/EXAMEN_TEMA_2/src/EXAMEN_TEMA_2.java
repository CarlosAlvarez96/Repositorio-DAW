
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import java.awt.Graphics;
import java.io.File;

public class EXAMEN_TEMA_2 {

    public static void main(String args[]) {
        Consola con = new Consola();
        CapaTexto texto = con.getCapaTexto();
        CapaCanvas canvas = con.getCapaCanvas();
        CapaFondo fondo = con.getCapaFondo();
        Teclado t = con.getTeclado();
        File foto = new File("C:\\Users\\CARLOS\\Desktop\\examen tema 2\\escudo.png");
        BufferedImage img = ImageIO.read(foto);
        texto.print("¿Dónde deseas dibujar la bandera? 1(En pantalla), 2(En un pdf)");
        int respuesta = t.leerNumeroEntero();
        if (respuesta == 1) {
            Graphics g = canvas.getGraphics();
            g.drawRect(120, 90, 50, 80);
            g.drawRect(170, 90, 50, 80);
            g.drawImage(img, 160, 80, observer);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }

            /*}else if(respuesta==2){
            try{
                PDFJob pdf = new PDFJob("C:\\Users\\CARLOS\\Desktop\\examen tema 2");
                Graphics gr = pdf.getGraphics();
                gr.
            }catch(IOException e){
                System.out.println(e);
            }*/
        }
    }
}
