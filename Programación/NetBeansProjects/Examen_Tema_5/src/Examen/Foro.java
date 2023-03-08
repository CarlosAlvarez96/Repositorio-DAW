package Examen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Foro implements ContenedorPublicaciones {

    private Set<Usuario> usuarios;
    private List<Post> publicaciones;
    private List<Post> borradores;

    public Foro() {
        Set<Usuario> usuarios = new HashSet<>();
        List<Post> publicaciones = new ArrayList<>();
        List<Post> borradores = new ArrayList<>();
    }

    public Usuario nuevoUsuario(String n, String email) {
        Usuario user = new Usuario(n, email);
        if (usuarios.contains(user)) {
            throw new IllegalArgumentException("Usuario repetido");
        } else {
            usuarios.add(user);
        }
        return user;
    }

    public boolean añadirPost(Post p) {
        boolean b = false;
        if (usuarios.contains(p.getUsuario())) {
            throw new IllegalArgumentException("Usuario no autorizado");

        } else {

        }
        return b;
    }

    
        public void actualizar{
    for (int i = 0; i < borradores.size(); i++) {
        Post a = borradores.get(i);
            if (a.esBorrador()){
                publicaciones.add(a);
                borradores.remove(a);
            }
        }
    }
}
