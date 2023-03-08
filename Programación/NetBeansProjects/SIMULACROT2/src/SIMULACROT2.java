
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import java.awt.Graphics;

/*
Ejercicio 2
Consulta el documento ejercicio3.pdf y busca en la clase Graphics de
ese documento un método que sirva para dibujar un polígono. Haz un
programa que:
a) Dibuje en la CapaCanvas de una Consola DAW el polígono de la siguiente
imagen:

b) Una vez que esté dibujado, use la clase Robot (ver el archivo
ejercicio3.pdf) para hacer una captura del dibujo y después usa la clase
ImageIO del pdf “java 2d” y busca en ella un método para guardar la
imagen capturada en un archivo llamado estrella.png
*/
public class SIMULACROT2{
    public static void main(String Args[]){
        Consola c= new Consola();
        CapaCanvas cc= c.getCapaCanvas();
        Graphics g = cc.getGraphics();
        g.drawLine(53,224, 202, 180);
        g.drawLine(202,180, 250, 46);
        g.drawLine(250,46, 296, 180);
        g.drawLine(296,180, 446, 224);
        g.drawLine(446,224, 297, 268);
        g.drawLine(297,268, 250, 400);
        g.drawLine(250,400, 203, 268);
        g.drawLine(203,268, 53, 224);
        try{
            Thread.sleep(100000);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}