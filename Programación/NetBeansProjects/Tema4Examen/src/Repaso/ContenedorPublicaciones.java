
package Repaso;

import java.util.ArrayList;
import java.util.List;


public interface ContenedorPublicaciones {
    public List<Post> getPublicaciones();
    public default List<Post> getPublicaciones(Usuario u){
        List<Post> resultado=new ArrayList<>();
        List<Post> total = getPublicaciones();
        for(Post i: total){
            if(i.getUsuario().equals(u)){
                resultado.add(i);
            }
        }
        return resultado;
    }
    
    default List<Post> getUsuario(String[] etiquetas){
        List<Post> resultado=new ArrayList<>();
        for(Post i:getPublicaciones()){
            int contador=0;
            for(String e: etiquetas){
                if(i.getEtiquetas().contains(e)){
                    contador++;
                }
            }            
            if(contador==etiquetas.length){
                resultado.add(i);
            }
        }        
        return resultado;
    }
}
