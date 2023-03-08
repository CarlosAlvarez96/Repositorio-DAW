/*Ejercicio 31: En la librería Música se encuentran clases para reproducir una sencilla partitura 
en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente 
canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra.*/
import bpc.daw.musica.*;

public class T2EJERCICIO31 {

    public static void main(String args[]) {
        Cancion c = new Cancion("Temazo");
        NotaMusical DoNegra = new NotaMusical(0, 2);
        NotaMusical ReSemicorchea = new NotaMusical(1, 4);
        NotaMusical MiCorchea = new NotaMusical(2, 3);
        NotaMusical MiSemicorchea = new NotaMusical(2, 4);
        NotaMusical FaCorchea = new NotaMusical(3, 3);
        NotaMusical FaSemicorchea = new NotaMusical(3, 4);
        NotaMusical SolNegra = new NotaMusical(4, 2);
        NotaMusical SolBlanca = new NotaMusical(4, 3);
        NotaMusical LaNegra = new NotaMusical(5, 2);
        Instrumento p = new Piano();
        Instrumento g = new Guitarra();
        c.añadir(DoNegra);
        c.añadir(DoNegra);
        c.añadir(SolNegra);
        c.añadir(SolNegra);
        c.añadir(LaNegra);
        c.añadir(LaNegra);
        c.añadir(SolBlanca);
        c.añadir(FaCorchea);
        c.añadir(FaCorchea);
        c.añadir(MiCorchea);
        c.añadir(MiCorchea);
        c.añadir(ReSemicorchea);
        c.añadir(MiSemicorchea);
        c.añadir(FaSemicorchea);
        c.añadir(ReSemicorchea);
        c.añadir(DoNegra);
        p.reproducir(c);
        g.reproducir(c);
    }

}
