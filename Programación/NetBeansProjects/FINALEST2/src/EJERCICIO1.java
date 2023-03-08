
import bpc.daw.consola.*;
import static java.awt.Color.RED;

/*1) Realiza un programa que abra una ConsolaDAW a pantalla completa y muestre por 
pantalla en el centro de la pantalla con letras rojas la frase "Bienvenidos al instituto" y 
hacer que el programa finalice al pasar 10 segundos. 
 */
public class EJERCICIO1 {

    public static void main(String args[]) {
        try {
            Consola con = new Consola();
            con.getCapaTexto().setColorTexto(RED);
            con.getCapaTexto().print(10, 18, "Bienvenidos al instituto");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
