
package com.iesHlanz.Ej_25_26_27_28;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class Cuadrado extends Rectangulo{
    private int longitudLado;
    
    public Cuadrado(Point esquinaSuperiorIzquierda, int longitudLado, Color color){
        super(esquinaSuperiorIzquierda, new Point(esquinaSuperiorIzquierda.x+longitudLado,esquinaSuperiorIzquierda.y+longitudLado),color);
        this.longitudLado=longitudLado;
    }
}
