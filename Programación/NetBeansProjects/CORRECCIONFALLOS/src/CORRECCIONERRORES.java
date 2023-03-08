
import bpc.daw.ascensor.*;

public class CORRECCIONERRORES {

    public static void main(String args[]) {
        Persona p = new Persona("Paula", 70);
        Ascensor a = new Ascensor(-1, 5, 100);
        try {
            a.añadir(p); //LLAMADA A MÉTODO QUE PUEDE FALLAR (CHECKEDEXCEPTION)
            System.out.println("Persona añadida correctamente");
        } catch (PesoMaximoException error) {
            System.out.println("No se pudo meter en el ascensor");
        }
        System.out.println("Fin");
    }

}

