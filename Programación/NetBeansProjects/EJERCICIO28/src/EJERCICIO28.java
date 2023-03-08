import java.util.*;
//error linea 10, no funciona boolean
public class EJERCICIO28 {
    public static void main(String args[]) {
        
        System.out.println("¿Eres adulto?");
        int edad= new Scanner(System.in).nextInt();
        boolean acompañado= true;
        boolean dejasalir= (edad>=18 || acompañado==true);
        if (dejasalir){
            System.out.println("Puede pasar");
        }else{
            System.out.println("No puede salir");
        }
    }     
}




























/*
boolean adulto = true;
        boolean menor = false;
        boolean acompañado = true;
        boolean mena = false;
        System.out.println("Eres un adulto?"+adulto);
        System.out.println("Vas acompañado?"+menor);
        boolean dejarpasar= adulto || acompañado;
        System.out.println("Pase y gracias"+dejarpasar);
        
    */