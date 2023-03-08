package ClasesTEMA4;

import java.time.LocalDate;
import java.util.*;

public class Oficina {

    private String nombre;
    private ArrayList<Persona> trabajadores;

    private Oficina(String nombre, int tipo) {
        this.nombre = nombre;

        switch (tipo) {
            case 1 -> {
                trabajadores.add(new Persona("Antonio Pérez Pérez", new DNI("11111111H"), 900, LocalDate.of(2000, 2, 28)));
            }
            case 2 -> {
                trabajadores.add(new Persona("Luis López López", new DNI("22222222J"), 1000, LocalDate.of(1995, 9, 10)));
            }
            case 3 -> {
                trabajadores.add(new Persona("Ana Díaz Díaz", new DNI("33333333P"), 1200, LocalDate.of(1985, 5, 21)));
            }
            default -> {
                System.out.println("Lista vacia");
            }
        }
    }

    private Oficina(String nombre) {
        this(nombre, 0);
    }

    private Oficina() {
        this("Industrias DAW", 3);
    }

    public void añadirEmpleado(Persona p) {
        trabajadores.add(p);
    }

    public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac) {
        Persona p = new Persona(nombre, new DNI(DNI), sueldo, fechaNac);
        trabajadores.add(p);
    }

    /*----------------------------------Ejercicio 14-----------------------------------*/
    public int getTotalEmpleados() {
        int numeroTrabajadores = trabajadores.size();
        return numeroTrabajadores;
    }

    public int getTotalEmpleadosMileuristas() {
        List<Persona> empleadosMileuristas = new ArrayList<>();
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).esMileurista()) {
                empleadosMileuristas.add(trabajadores.get(i));
            }

        }
        return empleadosMileuristas.size();
    }

    public List<Persona> getMileuristas() {
        List<Persona> empleadosMileuristas = new ArrayList<>();
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).esMileurista()) {
                empleadosMileuristas.add(trabajadores.get(i));
            }
        }
        return empleadosMileuristas;
    }
    public boolean trabaja(Persona p) {
        boolean siTrabaja = false;
        if (trabajadores.contains(p)) {
            siTrabaja = true;
        }
        return siTrabaja;
    }

    public void pagarEmpleados() {
        for (int i = 0; i < trabajadores.size(); i++) {
            Persona p = trabajadores.get(i);
            p.cobrarSueldo();
        }
    }

    public void mostrarInformeEmpleados() {
        System.out.println(trabajadores.toString());
        for (int i = 0; i < trabajadores.size(); i++) {
            Persona p = trabajadores.get(i);
            String n = p.getNombre();
            double s = p.getSueldo();
            boolean m = p.esMileurista();
            String bool=" ";
            if(m){
                bool = "es";
            }else{
               bool="no es"; 
            }
            System.out.println("El empleado: "+n+" ,cobra: "+s+" euros, "+bool+" mileurista");
        }
    }
    
    /*----------------------EJERCICIO17---------------------------*/
    
    public double getSueldoMedio()  throws Exception{
        double sueldoTotal = 0;
            for(int i = 0; i<trabajadores.size();i++){
                Persona p= trabajadores.get(i);
                double sueldo = p.getSueldo();
                sueldoTotal += sueldo;
            }
            if(sueldoTotal==0){
                throw new Exception ("error");
            }
            return sueldoTotal/trabajadores.size();
    }
    
    /*---------------------EJERCICIO27------------------------*/
    
public static Oficina getOficinaVacia(String nombre){
    Oficina o= new Oficina(nombre,0);
    return o;
} 
public static Oficina getOficinaPequeña(String nombre) {
    Oficina o1= new Oficina(nombre,1);
    return o1;
}
public static Oficina getOficinaMediana(String nombre) {
    Oficina o2= new Oficina(nombre,2);
    return o2;
}
public static Oficina getOficinaGrande(String nombre) {
    Oficina o3= new Oficina(nombre,3);
    return o3;
}

}
