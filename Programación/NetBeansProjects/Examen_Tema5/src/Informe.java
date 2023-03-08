
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;


public abstract class Informe {
    protected Map<String,List<Articulo>> almacen;
    
    public Informe (List<Articulo> almacen){
        for(Articulo art : almacen){
            this.almacen.put(art.getDescriptor().marca(), almacen);
        }
    }
    
    public void generarInforme(String ruta)throws IOException{
        File archivo = new File(ruta);
        FileWriter fw = new FileWriter(archivo);
        fw.write(this.getInformacion());
    }
    protected abstract String getInformacion();
}
