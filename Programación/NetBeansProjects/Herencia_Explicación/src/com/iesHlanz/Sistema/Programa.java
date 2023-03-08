/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iesHlanz.Sistema;

/**
 *
 * @author CARLOS
 */
public class Programa {
    public static void main (String [] args){
        Ordenador a = new Ordenador(4,"WIndows","HP");
        a.encender();
        
        Mac b = new Mac(4,"stevejobs@apple.com",2);
        b.encender();
        
        a.abrirNavegador();
        b.abrirNavegador();
    }
}
