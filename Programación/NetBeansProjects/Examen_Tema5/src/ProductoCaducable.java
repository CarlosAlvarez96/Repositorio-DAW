
import java.time.LocalDate;


public class ProductoCaducable extends ProductoNormal{
    private LocalDate fechaCaducidad;
    public ProductoCaducable(String n, String m, int p, int ud,int pre,LocalDate fc) {
        super(n, m, p, ud, pre);
        this.fechaCaducidad=fc;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }
    public boolean estaCaducado(){
        boolean caducado=false;
        if(LocalDate.now().isBefore(fechaCaducidad)){
            caducado=true;
        }
        return caducado;
    }

    @Override
    public int getPrecio(){
        int precioFinal = super.getPrecio();
        if(super.getPrecio()>3 && (LocalDate.now().getDayOfMonth()+10)>this.fechaCaducidad.getDayOfMonth()){
            precioFinal--;
            precioFinal--;
        }
        return precioFinal;
    }
}
