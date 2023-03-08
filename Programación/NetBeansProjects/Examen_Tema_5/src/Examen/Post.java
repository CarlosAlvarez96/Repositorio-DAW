
package Examen;

import java.time.LocalDateTime;
import java.util.List;


public class Post {
    private Usuario usuario;
    private String texto;
    private boolean borrador;
    private LocalDateTime momentoPublicacion;
    private List<String> etiquetas;
    
    public Post(Usuario u, String t){
        this.usuario = u;
        this.texto=t;
        Rol.valueOf(t);
        if (Rol.valueOf(t).equals(Rol.USUARIO_BANEADO)){
            throw new IllegalStateException ("usuario baneado");
        }
        this.momentoPublicacion=null;
       this.borrador=true;
        this.etiquetas=null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }

    public boolean esBorrador() {
        return borrador;
    }

    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }
    public void setTexto(String txt){
        if(this.borrador==true){
            this.texto=txt;
        }else if(this.esPublicado()){
            
        }
        
        
    }
    public boolean esPublicado(){
        return this.borrador==true?false:true;
    }
    public void publicar(){
        if(this.esPublicado()){
            throw new IllegalStateException ("El post ya esta publicado");
        }else{
            this.borrador=false;
            this.momentoPublicacion = LocalDateTime.now();
        }
    }
    public void etiquetar(String etiqueta){
        etiquetas.add(etiqueta);
    }
    
}
