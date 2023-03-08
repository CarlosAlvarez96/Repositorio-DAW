
package com.iesHlanz.Sistema;

import java.io.IOException;

public class Ordenador {
    private boolean encendido;
    private int capacidadRam;
    private String sistemaOperativo;
    private String marca;
    
    public Ordenador(int cr, String so, String m){
        capacidadRam=cr;
        sistemaOperativo=so;
        marca=m;
    }
    
    public void encender(){
        this.encendido=true;
        System.out.println("Comprobando memoria ram");
        System.out.println("Comprobando cpu");
        System.out.println("Cargando SO"+sistemaOperativo);
    }
    
    public void abrirNavegador(){
        if(!encendido){
            throw new YerayException();
        }
        Runtime r=Runtime.getRuntime();
        //Método deprecado = método antiguo y no recomendable
        try{
        r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        }catch(IOException e){
            System.out.println("No se puede abrir chrome"+e);
        }
    }
    
}
