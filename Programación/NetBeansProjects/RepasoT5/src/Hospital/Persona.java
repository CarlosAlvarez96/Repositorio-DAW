
package Hospital;

public class Persona implements IPersona{

    private String dni;
    private String nombre;
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    public String getDni(){
        return this.dni;
    }
}
