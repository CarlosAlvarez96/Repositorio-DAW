package com.ieshlanz.juego.clases;

import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.Sprite;
import bpc.daw.consola.Teclado;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.Map;

public class PersonajePrincipal {
    //Se crea el personaje pricipal y su tabla de rectangulos
        private static Rectangle [][] rectangulosPersonajePrincipal={
            {
                new Rectangle(21,11,83,116),
                new Rectangle(123,12,95,126),
                new Rectangle(215,2,116,118),
                new Rectangle(331,10,102,123),
                new Rectangle(451,13,83,110),
                new Rectangle(551,12,91,123),
                new Rectangle(641,10,114,129),
                new Rectangle(776,5,98,121)
            },
            
            //Segunda fila
            {
                new Rectangle(2,148,99,115),
                new Rectangle(101,151,114,112),
                new Rectangle(222,152,94,121),
                new Rectangle(325,145,93,122),
                new Rectangle(433,152,94,105),
                new Rectangle(540,153,109,101),
                new Rectangle(645,159,103,131),
                new Rectangle(753,150,82,112)
            }
        };
        
        // fila y columna del rectángulo del frame del persoaje principal
        private int filaPersonajePrincipal;
        private int columnaPersonajePrincipal;
        private int lineaTiempoPersonajePrincipal;
        private Sprite sprite;
        
        public PersonajePrincipal(CapaSprites cs, Map<String,Image> fotos){
            this.filaPersonajePrincipal = 0;
            this.columnaPersonajePrincipal = 0;
            this.lineaTiempoPersonajePrincipal = 0;
            this.sprite = cs.crearSprite(fotos.get("animacion.png"), rectangulosPersonajePrincipal[filaPersonajePrincipal][columnaPersonajePrincipal],
                150, 600);
        }
        
        
        private void gestionarLineaDeTiempo(){
        if(lineaTiempoPersonajePrincipal<0){
            lineaTiempoPersonajePrincipal = 79;
        }    
        if(lineaTiempoPersonajePrincipal>90){
            lineaTiempoPersonajePrincipal = 79;
        } 
            columnaPersonajePrincipal = lineaTiempoPersonajePrincipal <10 ? 0:
                                    lineaTiempoPersonajePrincipal <20 ? 1 :
                                    lineaTiempoPersonajePrincipal <30 ? 2 :
                                    lineaTiempoPersonajePrincipal <40 ? 3 :
                                    lineaTiempoPersonajePrincipal <50 ? 4 :
                                    lineaTiempoPersonajePrincipal <60 ? 5 :
                                    lineaTiempoPersonajePrincipal <70 ? 6 :
                                    lineaTiempoPersonajePrincipal <80 ? 7 : 0;
            
            if(lineaTiempoPersonajePrincipal == 90){
                lineaTiempoPersonajePrincipal = 0;
                columnaPersonajePrincipal = 0;   
            }
            sprite.setRectanguloFrame(rectangulosPersonajePrincipal[filaPersonajePrincipal][columnaPersonajePrincipal]);
        }
        private void moverDerecha(){    
            sprite.moverX(4);
            lineaTiempoPersonajePrincipal++;
            filaPersonajePrincipal = 0;
            this.gestionarLineaDeTiempo();
        }
        
        private void moverIzquierda(){
            sprite.moverX(-4);
            lineaTiempoPersonajePrincipal--;
            filaPersonajePrincipal = 1;
            this.gestionarLineaDeTiempo();
        }
        
        public int getX(){
            return sprite.getX();
        }
        
        public void moverX(int px){
            sprite.moverX(px);
            
        }
        
        public void actuar(Graphics g, Teclado t){
            //calculo con la nueva línea de tiempo el siguiente frame
            if(t.teclaPulsada(KeyEvent.VK_RIGHT)){
                moverDerecha();
            }
            
            
                        //Movemos el player
            
            if(t.teclaPulsada(KeyEvent.VK_LEFT)){
                moverIzquierda();
                
            }
            if(t.teclaPulsada(KeyEvent.VK_UP)){
                sprite.moverY(-4);
                lineaTiempoPersonajePrincipal++;
            }
            if(t.teclaPulsada(KeyEvent.VK_DOWN)){
                sprite.moverY(4);
                lineaTiempoPersonajePrincipal++;
            }
            
            
        }
        public Sprite getSprite(){
            return sprite;
        }
    
}
