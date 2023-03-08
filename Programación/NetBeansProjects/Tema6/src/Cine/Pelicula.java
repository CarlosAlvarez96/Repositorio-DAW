
package Cine;

import java.awt.Image;

public record Pelicula(String titulo, String rutaFoto) {

    public Pelicula(String titulo, String rutaFoto) {
        this.rutaFoto = null;
        this.titulo = null;
    }
    public Image getFoto(){
        
    }
}

