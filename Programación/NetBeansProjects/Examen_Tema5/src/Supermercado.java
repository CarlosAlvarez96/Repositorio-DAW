
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Supermercado {

    private String nombre;
    private Set<Control> controles;
    private List<Articulo> existencias;

    public Supermercado(String n) {
        this.nombre = n;
        this.controles = new HashSet<>();
        this.existencias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirControl(Control c) {
        this.controles.add(c);
    }

    public void recibirStock(Articulo a) throws SupermercadoException {
        boolean aceptado = false;
        for (Control c : this.controles) {
            aceptado = c.aceptar(a);
            if (aceptado == false) {
                throw new SupermercadoException(c.getMensajeError());
            }
        }
        if (aceptado == true) {
            this.existencias.add(a);
        }
    }

    public boolean comprar(Cliente c, DescriptorArticulo a, int dinero) {
        boolean compra = false;
        for (Articulo art : this.existencias) {
            if (art.getDescriptor().equals(a)) {
                if (dinero >= art.getPrecio()) {
                    art.vender(1);
                    compra = true;
                    c.articulosComprados.add(a);
                    if (art.getUnidadesDisponibles() == 0) {
                        this.existencias.remove(art);
                    }
                }
            }
        }
        return compra;
    }

    public Informe getInforme(String tipo) {
        Informe informe = null;
        if (tipo.equals("JSON")) {
            informe = new InformeJSON(existencias);
        } else if (tipo.equals("XML")) {
            informe = new InformeXML(existencias);
        } else {
            throw new IllegalArgumentException("Tipo de informe no admitido");
        }
        return informe;
    }
}
