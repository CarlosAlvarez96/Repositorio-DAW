package com.ieshlanz.tema4;

import java.awt.Color;
import java.util.List;

public class Coche {

    private String matricula;
    private Color color;
    private int velocidad;
    private boolean encendido;
    private List<Perro> perros;

    //constructor principal:
    //asigna los parámetros a las propiedades
    //la velocidad estará entre 0 y 230km
    //si no, ponemos la velocidad=0
    //la matrícula tiene formato 1234ABC
    //si la matricula es incorrecta, le ponemos matricula "0000AAA"
    public Coche(String m, Color c, int v, boolean e) {
        if (m.matches("\\d{4}[A-Z]{3}")) {
            matricula = m;
        } else {
            matricula = "0000AAA";
        }
        color = c;
        if (v <= 230 && v >= 0) {
            velocidad = v;                //asignación condicional:
        } else {                          // v>=0 && v<=230? v:0;
            velocidad = 0;
        }
        encendido = e;
    }

    public Coche(String m, Color c) {
        //forma mala(puntua menos)
        /*if(m.matches("\\d{4}[A-Z]{3}")){
        matricula=m;
        }else{
            matricula="0000AAA";
        }
         color=c;
         velocidad=0;
         encendido=false;
         */
        //forma buena:
        this(m, c, 0, false);
    }
    //crea un coche con la marca pasada como parametro,
    //color blanco, 
    public Coche(String m){
    this(m,Color.white);
    }
    //Devuelve la matrícula del coche
    public String getMatricula(){
        return matricula;
    }
    //Devuelve el color del coche
    public Color getColor(){
        return color;
    }
    //Devuelve la velocidad del coche
    public int getVelocidad(){
        return velocidad;
    }
    //Devuelve si el coche esta encendido (true) o apagado (falso)
    public boolean estaEncendido(){
        return encendido;
    }
}

