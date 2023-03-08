
package Repaso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Post {
    private Usuario usuario;
    private String texto;
    private boolean borrador;
    private LocalDateTime momentoPublicacion;
    private List<String> Etiquetas;
    
    public Post(Usuario u, String t){
        if(u.rol()==Rol.USUARIO_BANEADO){
            throw new IllegalStateException ("Usuario baneado");
        }
        this.borrador=true;
        this.momentoPublicacion=null;
        this.usuario=u;
        this.texto=t;
        this.Etiquetas=new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }

    public boolean isBorrador() {
        return borrador;
    }

    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public List<String> getEtiquetas() {
        return Etiquetas;
    }
    public void setTexto(String txt){
        if(borrador=true){
            
        }else{
            this.momentoPublicacion=LocalDateTime.now();
            LocalDateTime momento5min = LocalDateTime.now().plusMinutes(5);
            if(this.momentoPublicacion.isAfter(momento5min)){
                throw new IllegalStateException ("El mensaje ya no se puede modificar");
            }
        }
    }
    public boolean esPublicado(){
        return !borrador;
    }
    public void publicar(){
        if(this.esPublicado()){
            throw new IllegalStateException ("El post ya está publicado");
        }else{
            this.borrador=false;
            this.momentoPublicacion=LocalDateTime.now();
        }
    }
    public void etiquetar(String etiqueta){
        this.Etiquetas.add(etiqueta);
    }
}
