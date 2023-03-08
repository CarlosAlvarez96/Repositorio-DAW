
package com.iesHlanz.Ej_25_26_27_28;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


public class Rectangulo implements Centrable,Apoyable{
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    public Rectangulo(Point esi,Point eid,Color c){
        this.esquinaSuperiorIzquierda=esi;
        this.esquinaInferiorDerecha=eid;
        this.color=c;
    }

    @Override
    public Point getCentro() {
        int posicionX= (this.esquinaInferiorDerecha.x+this.esquinaSuperiorIzquierda.x)/2;
        int posicionY= (this.esquinaInferiorDerecha.y+this.esquinaSuperiorIzquierda.y)/2;
        Point p = new Point (posicionX,posicionY);
        return p;
    }

    @Override
    public int getLongitudBase() {
        int lB=this.esquinaInferiorDerecha.x - this.esquinaSuperiorIzquierda.x;
        return lB;
    }

    @Override
    public int getLongitudAltura() {
        int h =this.esquinaInferiorDerecha.y - this.esquinaSuperiorIzquierda.y;
        return h;
    }

    @Override
    public double getArea() {
        return (this.getLongitudBase()*this.getLongitudAltura());
    }

    @Override
    public int getPerimetro() {
        return (int)(this.getLongitudBase()*2)+(this.getLongitudAltura()*2);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(this.esquinaSuperiorIzquierda.x, this.esquinaSuperiorIzquierda.y, this.getLongitudBase(), this.getLongitudAltura());
        
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
