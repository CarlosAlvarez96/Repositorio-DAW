package com.ieshlanz.juego.programa;


import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaSprites;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import com.ieshlanz.juego.clases.ActualizadorCamara;
import com.ieshlanz.juego.clases.Escenario;
import com.ieshlanz.juego.clases.PersonajePrincipal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;

public class Juego {
    public static void main(String[]arg){
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        CapaSprites capaSprites = consola.getCapaSprites();
        Graphics g = capaCanvas.getGraphics();
        Teclado t = consola.getTeclado();
        
        // Aqué se almacenan la asociación de fotos con su nombre
        Map<String, Image> fotos = new HashMap<>();
        
        //Cargamos las fotos
        List<String> nombreFotos = List.of("animacion.png","esqueleto.png","fondo1.jpg","fondo2.jpg", "fondo3.jpg",
                                            "monstruo.png", "skull.png", "skull2.png","bat.png");
        
        int contador= 0;
        for(String i : nombreFotos){
            capaTexto.cls();
            int porcentaje = (100* contador)/nombreFotos.size();
            capaTexto.print(12, 25, "Cargando ... " + i + " " + porcentaje + "%");

            InputStream datos = ClassLoader.getSystemResourceAsStream("com/ieshlanz/juego/resources/" + i);
            try{
            Image fotoCargada = ImageIO.read(datos);
            fotos.put(i, fotoCargada);
            }
            catch(IOException error){
                capaTexto.println("Error al cargar el archivo: " + i);
                capaTexto.println("Motivo: " + error.getMessage());
            }
            contador++;
        }
        
        capaTexto.cls();

        PersonajePrincipal player = new PersonajePrincipal(capaSprites,fotos);
        Escenario e = new Escenario(fotos.get("fondo1.jpg"));
        ActualizadorCamara  a = new ActualizadorCamara(player,e);
        Murcielago m = new Murcielago(capaSprites, fotos.get("murcielago.png"));
        boolean repetir = true;
        
        
        //GAME LOOP
        while(repetir){
            e.actuar(g, t);
            //Si se pulsa Esc se acaba
            if(t.teclaPulsada(KeyEvent.VK_ESCAPE)){
                repetir = false;
            }
            player.actuar(g, t);
            a.actuar(g, t);
            n.actuar(capaSprites,fotos.get("bat.png"));
            if(n.hayColision(player)){
            repetir=false;
        }
            
            
            
            

                    
                    
            
            
            
            //60 FPS
            consola.esperarSiguienteFrame();
            consola.getCapaTexto().println("GAME OVER");
        }        
    }
}
