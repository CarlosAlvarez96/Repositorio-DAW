
import java.time.LocalDate;


public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;
    private Localidad localidad;
    public Persona(String n, int e, LocalDate fn, Localidad l){
        nombre=n;
        edad=e;
        fechaNacimiento=fn;
        this.localidad=l;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int compareTo(Persona p) {
        //Para ordenar por edad
        //return this.edad-p.edad; 
        //Para ordenar por orden alfabético
        //return this.nombre.compareTo(p.nombre);
        //Para ordenar por fecha de nacimiento
        //return this.fechaNacimiento.compareTo(p.fechaNacimiento);
        return this.localidad.compareTo(p.localidad);
    }
    
    
}
