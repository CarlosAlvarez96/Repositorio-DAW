
package com.iesHlanz.Ej_25_26_27_28;

import java.awt.Graphics;
import java.awt.Point;


public interface FiguraGeometrica extends Coloreable {
    public double getArea();
    public int getPerimetro();
    public void dibujar(Graphics g);
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        return new Cuadrado(esquinaSuperiorIzquierda,(int)Math.sqrt(this.getArea()),getColor());
    }
}
