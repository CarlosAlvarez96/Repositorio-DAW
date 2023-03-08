



public abstract class Articulo {
    private DescriptorArticulo descriptor;
    private int unidadesDisponibles;
    
    public Articulo(String n, String m, int p, int ud){
        if(ud<0){
            throw new IllegalArgumentException ("las unidades disponibles deben ser positivas");
        }
        this.unidadesDisponibles=ud;
        this.descriptor= new DescriptorArticulo(n,m,p);
    }

    public DescriptorArticulo getDescriptor() {
        return descriptor;
    }
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public int vender(int cantidad){
        int vendido=0;
        if(cantidad>this.unidadesDisponibles){
            vendido=this.unidadesDisponibles;
        }else{
            vendido=cantidad;
        }
        return vendido;
    }
    public ProductoOferta ofertar(int porcentaje){
        return new ProductoOferta(this,porcentaje);
    }
    public abstract int getPrecio();
    
    
}
