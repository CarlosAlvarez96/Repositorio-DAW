
package Juego_Naves;

import bpc.daw.consola.Consola;
import java.util.ArrayList;
import java.util.List;


public abstract class Escena {
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;
    
    public Escena(){
        this.objetos=new ArrayList<>();
        this.consola= new Consola();
        
    }
    protected abstract void añadirObjetosIniciales();
    
    protected void añadir(GameObject obj){
        this.objetos.add(obj);
    }
    protected void retirar(GameObject obj){
        this.objetos.remove(obj);
    }
}
