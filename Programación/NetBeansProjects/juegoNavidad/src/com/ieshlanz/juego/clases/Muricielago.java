
package com.ieshlanz.juego.clases;

import bpc.daw.consola.Sprite;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;


public class Muricielago {
    private static Rectangle[] rectangilo={
    new Rectangle(29,3,118,82),
    new Rectangle(164,19,149,68),
    new Rectangle(356,9,114,97)
};

private Sprite sprite;
private int lineaTiempo;
private int rectangulo; 
private int amplitud;
private int frecuencia;
public Muricielago(Image imagen){
    lineaTiempo=360;
    rectangulo=0;
    int resX=Toolkit.getDefaultToolkit().getScreenSize().width-400;
    int resY=Toolkit.getDefaultToolkit().getScreenSize().height-600;
    int y = new Random().nextInt(resY);
    amplitud= new Random().nextInt(80,300);
    frecuencia = new Random().nextInt(3,15);
    sprite= cs.crearSprite(imagen,rectangulos[0],
)

public void actuar(){
Murcielago m = new Murcielago(capaSprites, fotos.get("bat.png"));
    sprite.moverX();
    int y = alturaInicial+80*Math.sin(Math.toRadians(lineaTiempo));
    lineaTiempo-=5;
    if(lineaTiempo<0){
    lineaTiempo=360;
}
sprite.setPosicion(sprite.getX(),y);
}
public Sprite getSprite(){
            return sprite;
        }
}
