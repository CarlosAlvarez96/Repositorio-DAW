
package PRODUCTOS;

import static PRODUCTOS.Categoria.ALIMENTACION;
import org.junit.Test;
import static org.junit.Assert.*;


public class TiendaTest {
    
    public TiendaTest() {
        
    }

    @Test
    public void getCategoria() {
        Tienda t = new Tienda();
        Producto p = new Producto ( "Pinta uñas",  3.50, Categoria.HOGAR, 3);
        t.agregarProducto(p);
        assertEquals(Categoria.HOGAR, t.getCategoria());
    }
    
}
