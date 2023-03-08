
package Examen;

import java.awt.List;
import java.util.ArrayList;


public interface ContenedorPublicaciones {
    
    public List<Post> getPublicaciones;
    
    public default List<Post> getPublicaciones(Usuario u){
        List<Post> lista = new ArrayList<>();
    }
    public default List<Post> getPublicaciones (String [] etiquetas){
        
    }
}
