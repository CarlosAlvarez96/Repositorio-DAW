
public class ProductoOferta extends Articulo{
    
    private Articulo producto;
    private int porcentajeDescuento;
    
    public ProductoOferta(Articulo p, int pd) {
        super(p.getDescriptor().nombre,p.getDescriptor().marca, p.getDescriptor().peso(), p.getUnidadesDisponibles());
        this.producto=p;
        this.porcentajeDescuento=pd;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public int getPrecio() {
        return super.g
    }
    
}
