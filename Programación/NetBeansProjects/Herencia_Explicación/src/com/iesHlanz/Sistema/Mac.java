
package com.iesHlanz.Sistema;

import java.io.IOException;


public class Mac extends Ordenador {
    private String cuentaApple;
    private int numeroPuertosThunderbolt;

    public Mac(int cr, String ca, int npt) {
        super(cr,"Mac OS","Apple");
        
    }
    @Override
    public void abrirNavegador(){
        try{
        Process p = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe")
                .start();
        }catch(IOException e){
            System.out.println("No se abre el Mozilla. "+e);
        }
    }
    @Override
    public void encender(){
        //Esto llama al metodo encender de la clase padre (Ordenador)
        super.encender();
    }
}
