package com.iesHlanz.Explicacion.Herencia;

public class Empleado extends Persona {
    //nombre
    //edad (inaccesible)
    //altura(visible porque es public)
    //peso(Accesible solo por clase hija, protected)
    private double sueldo;

    public Empleado(String n, int e, double t, double p, double s) {
        //Super llama al constructor de la clase padre(persona) y rellena las variables de instancia 
        //de la clase padre tal y como las rellena dicho constructor
        super(n, e, t, p);
        if (s > 0) {
            this.sueldo = s;
        }
        altura =225;
        nombre = "Hola";
        peso=25.3;
    }

    //Este constructor crea un empleado que gana 1000 euros, tiene 18 años y el resto de caracteristicas se pasan con parametros
    public Empleado(String n, double a, double p) {
        this(n, 18, a, p, 1000);
    }

    public double getSueldo() {
        return this.sueldo;
    }
}
