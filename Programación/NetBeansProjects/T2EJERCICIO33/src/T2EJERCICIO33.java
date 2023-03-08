/*Ejercicio 33 : Haz un programa que cree una lista de reproducción titulada “Lista de Ejemplo” y 
añádele tres canciones a ellas. El programa deberá guardar dicha lista en el disco duro (puedes 
inventar el nombre del archivo) y luego reproducir las tres canciones de forma síncrona. 
 */
import bpc.daw.reproductor.*;
import java.io.IOException;
public class T2EJERCICIO33 {

    public static void main(String args[]) {
        PlayList lista = new PlayList();
        lista.setTitulo("Lista de Ejemplo");
        String ruta1 = "C:\\Users\\CARLOS\\Desktop\\trololo.mp3";
        ArchivoMP3 cancion1 = new ArchivoMP3(ruta1);
        String ruta2 = "C:\\Users\\CARLOS\\Desktop\\thunderstruck.mp3";
        ArchivoMP3 cancion2 = new ArchivoMP3(ruta2);
        String ruta3 = "C:\\Users\\CARLOS\\Desktop\\Terror.mp3";
        ArchivoMP3 cancion3 = new ArchivoMP3(ruta3);
        String rutaLista ="C:\\Users\\CARLOS\\Desktop\\listaej33.txt";
        lista.añadir(cancion2);
        lista.añadir(cancion3);
        lista.añadir(cancion1);
        try{
            lista.guardar(rutaLista);
        }catch(IOException e) {
            System.out.println("No se pudo guardar la playlist");
        }
        Reproductor R = new Reproductor(lista, true, false);
        R.play();
    }
}
