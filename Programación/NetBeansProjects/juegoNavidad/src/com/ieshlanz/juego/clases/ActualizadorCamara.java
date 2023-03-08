package com.ieshlanz.juego.clases;


import java.awt.Graphics;

public class ActualizadorCamara {
    private PersonajePrincipal personaje;
    private Escenario escenario;
    
    public ActualizadorCamara(PersonajePrincipal p, Escenario e ){
        this.personaje = p;
        this.escenario = e;
        
    }
    
    public void actuar(Graphics g, Teclado t){
        int xPersonaje = personaje.getX();
        int mitadPantalla = escenario.getMitadPantallaX();
        if(mitadPantalla - 50 <= xPersonaje && xPersonaje <= mitadPantalla + 50){
            escenario.moverCamara(4);
            personaje.moverX(-4);
            if(mitadPantalla - 500 <= xPersonaje && xPersonaje <= mitadPantalla + 500){
                escenario.moverCamara(4);
                personaje.moverX(-4);
            }
        }
        

    }
    
}
