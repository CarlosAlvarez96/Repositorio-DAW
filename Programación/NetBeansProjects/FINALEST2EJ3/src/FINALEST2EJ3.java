
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoImagen;
import bpc.daw.consola.Teclado;
import java.awt.Image;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
3) Realiza un programa en el que la pantalla tenga como fondo una imagen y el cursor 
sea invisible. El programa mostrará un mensaje "Pulsa una tecla para salir", y al pulsar 
una tecla, finalizará.
 */
public class FINALEST2EJ3 {

    public static void main(String args[]) {
        Consola con = new Consola();
        Path imagen = Paths.get("H:\\Mi unidad\\PROGRAMACIÓN\\REPASO TEMA 2\\pajaro.png");
        Fondo F = new FondoImagen((Image) imagen);
        con.getCapaFondo().setFondo(F);
        con.getTeclado().setTipoCursor(Teclado.CURSOR_NULO);
    }
}
