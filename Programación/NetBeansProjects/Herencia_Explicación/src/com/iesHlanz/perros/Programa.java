
package com.iesHlanz.perros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Programa {
    public static void main(String[] args) {
        //Relleno el catálogo con 8 perros aleatorios
        List<Perro> catalogo = new ArrayList<>();
        for(int i = 0;i<8;i++){
                catalogo.add(PerroFactory.generarPerroAleatorio());
        }
        // Creamos el Carrito de la compra
        Carrito carrito = new Carrito();
        //bucle para elegir perro y añadirlo al carrito
        boolean repetir = true;
        while(repetir){
            System.out.println("""
                                            Tienda de perros HLANZ 
                                            ----------------------------------
                                            Elige el número de perro para añadirlo
                                            al carrito y pulsa 0 para finalizar la compra
                                                    """);
            //Mostramos una lista numerada con los perros 
            for(int i = 0; i<catalogo.size();i++){
                Perro p = catalogo.get(i);
                //¿Es abandonado?
                if(p instanceof PerroAbandonado a){
                   Set<String> enfermedades =  a.getEnfermedades();
                   System.out.println((i+1)
                            +" - "
                            +p.getNombre()
                            +"..."
                            +p.getRaza()
                            +"..."
                            +p.getPrecio()
                            +" Es abandonado, con enfermedades:"
                            + enfermedades);
                }else{
                    System.out.println((i+1)
                            +" - "
                            +p.getNombre()
                            +"..."
                            +p.getRaza()
                            +"..."
                            +p.getPrecio());
                }
            }
            int opcion = new Scanner(System.in).nextInt();
            if(opcion==0){
                repetir=false;
                if(carrito.esAbandonado()){
                    System.out.println("Enhorabuena, tienes un 5% de descuento");
                }
                System.out.println("El precio es: "+carrito.getPrecio());
            }else{
                Perro p = catalogo.get(opcion-1);
                carrito.comprar(p);
                catalogo.remove(p);
            }
        }
    }
}
