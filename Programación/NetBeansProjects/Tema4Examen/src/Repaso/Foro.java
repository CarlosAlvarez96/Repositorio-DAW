
package Repaso;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Foro implements ContenedorPublicaciones{
    private Set<Usuario> usuarios;
    private List<Post> publicaciones;
    private List<Post> borradores;
    
    public Foro(){
        this.usuarios= new HashSet<>();
        this.publicaciones= new ArrayList<>();
        this.borradores= new ArrayList<>();
    }
    public Usuario nuevoUsuario(String n, String email){
        Usuario user = new Usuario(n,email);
        if(this.usuarios.contains(user)){
            throw new IllegalArgumentException ("Usuario repetido");
        }else{
            this.usuarios.add(user);
        }
        return user;
    }
    public void añadirPost(Post p){
        List<Post> lista2 = new ArrayList<>();
        if(this.usuarios.contains(p.getUsuario())){
            throw new IllegalArgumentException ("Usuario no autorizado");
        }else if (this.publicaciones.get(0)==null){
            this.publicaciones.add(p);
        }else{
            for(int i = 0; i<this.publicaciones.size();i++){
                if(this.publicaciones.get(i).getMomentoPublicacion().isBefore(p.getMomentoPublicacion())){
                    lista2.add(this.publicaciones.get(i));
                }else{
                    lista2.add(p);
                }
            }
        }
        this.publicaciones=lista2;
    }
    public void actualizar(){
        for(Post i : borradores){
            this.añadirPost(i);
        }
        this.borradores.clear();
    }
    @Override
    public List<Post> getPublicaciones() {
        return this.publicaciones;
    }
    
}
