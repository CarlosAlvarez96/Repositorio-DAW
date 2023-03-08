/*Ejercicio 32 : En la librería ReproductorMúsica.jar se encuentran clases para reproducir 
archivos mp3 y crear listas de reproducción que pueden guardarse en el disco. Su diagrama de 
clases y documentación vienen en el pdf que acompaña la librería. Realiza un programa que 
reproduzca en segundo plano (asíncrona) un archivo mp3 que tengas en tu disco duro. Una vez 
comenzada la reproducción, se mostrará el título de la canción, su autor y su duración. */
import bpc.daw.reproductor.*;

public class T2EJERCICIO32 {

    public static void main(String args[]) {
        String ruta = "C:/Users/CARLOS/Desktop/trololo.mp3";
        ArchivoMP3 archivo = new ArchivoMP3(ruta);
        Reproductor R = new Reproductor(archivo, false, false);
        String titulo = archivo.getTitulo();
        String obtenerautor = archivo.getAutor();
        long obtenerduracion = archivo.getDuracion();
        System.out.println("El titulo de la cancion es: " + titulo + ", su autor es: " + obtenerautor + " y su duracion es: " + (obtenerduracion / 1000) / 60 + " minuto");
        R.play();

    }
}
