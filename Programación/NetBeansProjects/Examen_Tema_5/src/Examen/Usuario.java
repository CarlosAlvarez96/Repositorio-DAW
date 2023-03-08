package Examen;

import org.apache.commons.validator.routines.EmailValidator;

public record Usuario(String nombre, String email, Rol rol) {
        public class Usuario(String nombre, String email){
        this.nombre  = nombre;
        this.email  = email;
        this.Rol  = Rol.USUARIO;
    }

    public class Usuario(String email){
        
    }
        
        
         private class boolean validarEmail(String correo) {
        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(correo);
    }

    public class Usuariobanear(){
        return this(nombre , email, USUARIO_BANEADO);
        
}
    

public Post crearPost(String mensaje){
    Usuario u = new Usuario (this.nombre,this.email,this.rol);
    Post p = new Post(u,mensaje);
    return p;
}
}

