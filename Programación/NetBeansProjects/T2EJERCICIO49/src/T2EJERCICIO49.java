/*Ejercicio 49 : En la librería “Efecto Imagen” se encuentra la clase EfectoBuilder, que sirve para 
aplicar efectos a una imagen. Consulta su documentación y realiza un programa que haga esto: 
 Pregunte al usuario la ruta de un archivo con una imagen 
 Utiliza la clase ImageIO de la librería “java 2d” para cargar la imagen 
 Utiliza la clase EfectoImagen para aplicar, en este orden, los efectos “invertir”, 
“blurred” y “escala de grises” a la fotografía. 
 Cuando hayas terminado de aplicar los efectos, muestra una ventana en la que se vea 
la imagen final. */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;
import javax.imageio.*;

public class T2EJERCICIO49 {
    public static void main(String args[]) throws IOException {
        System.out.println("Escriba la ruta de un archivo con una imagen: ");
        String ruta = new Scanner(System.in).nextLine();
        File messi = new File(ruta);
        BufferedImage imagen = ImageIO.read(messi);
        EfectoBuilder efectos = new EfectoBuilder(imagen);
        efectos.aplicarEfecto(2763);
        efectos.aplicarEfecto( 2730);
        efectos.aplicarEfecto( 2748);
        efectos.build();

        
        
    }
}
