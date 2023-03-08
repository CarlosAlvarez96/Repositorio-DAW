package Trabajo;

public class TituloArchivo implements Titulo {
    private String dni;
    private String nombre;
    private String estudios;
    private Estado estado;

    public TituloArchivo(String d, String n, String e, Estado s) {
        this.dni = d;
        this.nombre = n;
        this.estado = s;
        this.estudios = e;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getEstudios() {
        return estudios;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado e) {
        estado = e;
    }

    public String toString() {
        return this.getDni() + ";" + nombre + ";" + estudios + ";" + this.getEstado().ordinal();

    }
}