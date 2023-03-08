
import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String nombre;
     List<DescriptorArticulo> articulosComprados;
    
    public Cliente(String n){
        this.nombre=n;
        this.articulosComprados=new ArrayList<>();
    }
}
