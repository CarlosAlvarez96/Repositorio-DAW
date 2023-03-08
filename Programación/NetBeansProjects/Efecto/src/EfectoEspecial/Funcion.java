
package EfectoEspecial;


public abstract class  Funcion {
    private String nombre;
    public Funcion(String n){
    nombre=n;
    }
public String getNombre(){
    return nombre;
    }
public abstract double calcularY(double x);

    }
