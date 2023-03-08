package com.ieshlanz.tema4;
//los imports van aquí

import java.awt.Point;

public class Perro {

    //propiedades/atributos
    public String nombre;
    public int edad;
    public String raza;
    public Point posicion;
    public boolean hambriento;

    //Este constructor rellena el nombre, edad
    //y raza con los parámetros recibidos. La 
    //posición es el punto de coordenadas (100,200)
    //y no tiene hambre
    //Si la edad es incorrecta (20 años)
    //la edad se pondrá a 4 años
    
    //CONSTRUCTOR SECUNDARIO -> manda los datos al constructor principal
    public Perro(String n, int e, String r) {
       this(n,e,r,new Point(100,200),false);
    }

    /*
    Este constructor rellena directamente los parámetros
    recividos en las propiedades
     */
    
    //CONSTRUCTOR PRINCIPAL -> es el constructor que recive todo
    public Perro(String n, int e, String r, Point p, boolean h) {
        nombre = n;
           if (e >= 0 && e < 20) {
        edad = e;
           }else{
               edad=4;
           }
        raza = r;
        posicion = p;
        hambriento = h;

    }
    
    
    /*
    Este constructor crea un perro cuyo nombre se 
    pasa como parámetro, tiene raza "bulldog", 
    edad 10, posición (10,20) y hambre
    */
    public Perro(String n){
        this(n,10,"bulldog",new Point(10,20),true);
    }
    
    
    /*
    Este constructor crea un perro que se llama Tom
    es un bulldog, edad 10, posición (10,20) y hambre=true
    */
    public Perro(){
        this("Tom");
    }
    /*
    Este constructor crea un perro cuyo nombre y edad se 
    pasan como parámetro. La raza es "bulldog", la posicion
    es (80,50) y no tiene hambre
    */
    public Perro(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        posicion= new Point(80,50);
        raza="bulldog";
        hambriento=false;
    }
    
    
}


