
package Hospital;

public class Enfermero implements IEnfermero{
    
    private String dni;
    private String nombre;
    private String enfermeria;

    @Override
    public String getEnfermeria() {
        return this.enfermeria;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
    
}
