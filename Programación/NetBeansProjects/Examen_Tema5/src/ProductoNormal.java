
public class ProductoNormal extends Articulo{
    private int precio;
    public ProductoNormal(String n, String m, int p, int ud,int pre) {
        super(n, m, p, ud);
        this.precio=pre;
    }

    public int getPrecio() {
        return precio;
    }
    
}
