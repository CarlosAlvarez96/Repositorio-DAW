
package com.iesHlanz.Ej_25_26_27_28;

import bpc.daw.consola.Consola;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circulo implements FiguraGeometrica,Centrable{
    private Point centro;
    private int radio;
    private Color color;
    
    public Circulo(Point centro, int radio, Color color){
        this.centro=centro;
        this.radio=radio;
        this.color=color;
    }

    @Override
    public double getArea() {
        return (this.radio*this.radio) * Math.PI;
    }

    @Override
    public int getPerimetro() {
        return (int)Math.PI*2*this.radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(this.centro.x,this.centro.y,this.radio*2, this.radio*2);
            }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
}
