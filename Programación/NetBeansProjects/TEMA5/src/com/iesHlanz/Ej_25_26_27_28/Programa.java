
package com.iesHlanz.Ej_25_26_27_28;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import com.iesHlanz.Ej_25_26_27_28.Circulo;
import com.iesHlanz.Ej_25_26_27_28.Cuadrado;
import com.iesHlanz.Ej_25_26_27_28.FiguraGeometrica;
import com.iesHlanz.Ej_25_26_27_28.Rectangulo;
import com.iesHlanz.Ej_25_26_27_28.Triangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        List<FiguraGeometrica> lista = new ArrayList<>();
        boolean repetir = true;
        while (repetir) {
            System.out.println("""
                           1) Añadir un rectángulo 
                           2) Añadir un cuadrado 
                           3) Añadir un círculo 
                           4) Añadir un triángulo 
                           5) Dibujar todo
                           """);
            int sc = new Scanner(System.in).nextInt();
            if (sc == 1) {
                System.out.println("Introduzca la coordenada en el eje x del vértice superior izquierdo del rectangulo");
                int esquinaSupIzqX = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice superior izquierdo del rectangulo");
                int esquinaSupIzqY = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje x del vértice inferior derecho del rectangulo");
                int esquinaInfDerX = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice inferior derecho del rectangulo");
                int esquinaInfDery = new Scanner(System.in).nextInt();
                System.out.println("Introduzca los valores RGB para el color");
                int r = new Scanner(System.in).nextInt();
                int g = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                Color c = new Color(r,g,b);
                Rectangulo rect = new Rectangulo(new Point(esquinaSupIzqX, esquinaSupIzqY), new Point(esquinaInfDerX, esquinaInfDery), c);
                lista.add(rect);
            } else if (sc == 2) {
                System.out.println("Introduzca la coordenada en el eje x del vértice superior izquierdo del rectangulo");
                int esquinaSupIzqX = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice superior izquierdo del rectangulo");
                int esquinaSupIzqY = new Scanner(System.in).nextInt();
                System.out.println("Introduzca longitud del lado");
                int longitudLado = new Scanner(System.in).nextInt();
                System.out.println("Introduzca los valores RGB para el color");
                int r = new Scanner(System.in).nextInt();
                int g = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                Color c = new Color(r,g,b);
                Cuadrado cuad = new Cuadrado(new Point(esquinaSupIzqX, esquinaSupIzqY), longitudLado, c);
                lista.add(cuad);

            } else if (sc == 3) {
                System.out.println("Introduzca la coordenada en el eje x del punto del círculo");
                int puntoX = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del punto del círculo");
                int puntoY = new Scanner(System.in).nextInt();
                System.out.println("Introduzca el radio");
                int radio = new Scanner(System.in).nextInt();
                System.out.println("Introduzca los valores RGB para el color");
                int r = new Scanner(System.in).nextInt();
                int g = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                Color c = new Color(r,g,b);
                Circulo cir = new Circulo(new Point(puntoX, puntoY), radio, c);
                lista.add(cir);
            } else if (sc == 4) {
                System.out.println("Introduzca la coordenada en el eje x del vértice superior izquierdo del rectangulo");
                int xV1 = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice superior izquierdo del rectangulo");
                int yV1 = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje x del vértice superior izquierdo del rectangulo");
                int xV2 = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice superior izquierdo del rectangulo");
                int yV2 = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje x del vértice superior izquierdo del rectangulo");
                int xV3 = new Scanner(System.in).nextInt();
                System.out.println("Introduzca la coordenada en el eje y del vértice superior izquierdo del rectangulo");
                int yV3 = new Scanner(System.in).nextInt();
                Triangulo tri = new Triangulo(new Point(xV1, yV1), new Point(xV2, yV2), new Point(xV3, yV3));
                lista.add(tri);
            } else if (sc == 5) {
                System.out.println("¿Donde quieres mostrarlo?\n"
                        + "1) PDF\n"
                        + "2) Consola Daw");
                int respuesta = new Scanner(System.in).nextInt();
                if (respuesta == 1) {
                    System.out.println("Lo siento profe no lo hice");
                } else if (respuesta == 2) {
                    Consola c = new Consola();
                    CapaCanvas cc = c.getCapaCanvas();
                    CapaTexto cT = c.getCapaTexto();
                    Graphics g = c.getCapaCanvas().getGraphics();
                    Teclado t = c.getTeclado();
                    for (FiguraGeometrica i : lista) {
                        cT.println("El perímetro es: " + i.getPerimetro());
                        cT.println("El área es: " + i.getArea());
                        i.dibujar(g);
                        t.leerCaracter();
                        cT.cls();
                    }
                }
                repetir = false;
            }
        }
    }
}
