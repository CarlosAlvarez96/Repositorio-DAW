
package Repaso;

import org.apache.commons.validator.EmailValidator;


public record Usuario(String nombre, String email, Rol rol) {
    
    public Usuario(String nombre,String email){
        this(nombre,email,Rol.USUARIO);
    }
    
    public Usuario(String email){
        this(email,email,Rol.USUARIO);
    }
    
    private boolean validarEmail(String correo){
        boolean valido = false;
        EmailValidator eV = EmailValidator.getInstance();
        valido = eV.isValid(correo);
        return valido;
    }
    public Usuario banear(){
        if(this.rol==Rol.ADMINISTRADOR){
            throw new IllegalStateException ("No se puede banear al administrador");
        }
        Usuario usuario = new Usuario(this.nombre,this.email,Rol.USUARIO_BANEADO);
        return usuario;
    }
    public Post crearPost(String mensaje){
        return new Post(this,mensaje);
    }
}
