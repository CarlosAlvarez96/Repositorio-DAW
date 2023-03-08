
package Restaurante;

import java.io.IOException;
import java.util.Random;

public class Impresora {
    private String marca;
    private boolean encendido;
    
    public Impresora(String marca){
        this(marca,false);
    }
    
    public Impresora(){
        this("EPSON");
    }
    
    public Impresora(String m, boolean e){
        this.marca=m;
        this.encendido=e;
    }
    
    public void imprimir(String texto) throws IOException{
        if(encendido){
            boolean aleatorio=new Random().nextBoolean();
            if(aleatorio){
                System.out.println(texto);
            }else{
                throw new IOException("no se puede imprimir");
            }
        }else{
            throw new IOException("Impresora apagada");
        }
    }
    
    public void encender(){
        encendido=true;
    }
    
    
}
