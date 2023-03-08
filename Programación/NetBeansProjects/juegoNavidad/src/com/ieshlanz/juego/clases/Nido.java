
package com.ieshlanz.juego.clases;

import java.util.ArrayList;
import java.util.List;


public class Nido {
    private List<Murcielago> murcielagos;
    private int lineaTiempo;
    private int aleatorio;
    
    public Nido(){
        murcielagos =new ArrayList<>();
        lineaTiempo=0;
        aleatorio=new Random().nextInt(500);
    }
    
    public void actuar (){
        for(Murcielago i:murcielagos){
            i.actuar();
        }
        lineaTiempo++;
        if(lineaTiempo==aleatorio){
            lineaTiempo=0;
            aleatorio=new Random().nextInt(500);
            Murcielago m = new Murcielago(cs,imagen);
            murcielagos.add(m);
        }
    }
    public boolean hayColisicon(PersonajePrincipal p){
        boolean choque=false;
        Sprite sprite1=p.getSprite();
        for(int i=0; i<murcielagos.size() && !choque; i++){
            if(sprite1.comprobarColision(m.getSprite())){
                choque=true;
            }
        }
            return choque;
    }
}
