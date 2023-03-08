
import bpc.daw.consola.CapaFondo;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Fondo;
import bpc.daw.consola.FondoImagen;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
Ejercicio 8: Usa la Consola DAW para hacer un programa que pregunte al usuario por la ruta de 
una imagen y la ponga como imagen de fondo. El programa entonces preguntará "¿Desea 
poner otra imagen?". Si el usuario pulsa la tecla S, se repetirá el proceso, y si pulsa cualquier 
otra tecla, finalizará. 
 */
public class T3EJERCICIO8 {

    public static void main(String args[]) {
        Consola con = new Consola();
        CapaFondo cf = con.getCapaFondo();
        boolean repetir = true;
        while (repetir) {
            System.out.println("Introduzca la ruta de una imagen");
            String ruta = new Scanner(System.in).nextLine();
            try {
                File archivoImg = new File(ruta);
                Image imagen = ImageIO.read(archivoImg);
                Fondo f = new FondoImagen(imagen);
                cf.setFondo(f);
            } catch (IOException c) {
                System.out.println(c);
            }
            System.out.println("¿Desea poner otra imagen(S/N)?");
            String s = new Scanner(System.in).nextLine();
            char opcion = s.charAt(0);
            switch(opcion){
                case 'N': repetir=false;
                case 'S': ;
                
            }
        }
    }
}
