
import com.google.gson.Gson;
import java.util.List;
import org.json.JSONObject;


public class InformeJSON extends Informe{
    public InformeJSON(List<Articulo> almacen){
        super(almacen);
    }

    @Override
    protected String getInformacion() {
        Gson gson = new Gson();
        String js = gson.toJson(almacen);
        return new  JSONObject(js).toString();
    }
}
