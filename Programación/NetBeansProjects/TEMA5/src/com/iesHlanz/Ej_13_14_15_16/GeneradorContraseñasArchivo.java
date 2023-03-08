package com.iesHlanz.Ej_13_14_15_16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorContraseñasArchivo {

    private File archivo;

    public GeneradorContraseñasArchivo(String ruta) {
        this.archivo = new File(ruta);
    }

    public GeneradorContraseñasArchivo(String ruta, Random r) {
        r = new Random();
        int CantidadContraseñas = r.nextInt();
        int contador = 0;
        boolean repetir = true;
        this.archivo= new File(ruta);
        GeneradorContraseñas gc = new GeneradorContraseñas();
        try {
            FileWriter fw = new FileWriter(this.archivo);
            while (repetir) {
                fw.write(gc.generarContraseña()+"/n");
                if(contador == CantidadContraseñas){
                    repetir=false;
                }
            }
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public String generarContraseña(int longitud) {
        GeneradorContraseñas g = new GeneradorContraseñas();
        String contraseña = g.generarContraseña(longitud);
        return contraseña;
    }
}
