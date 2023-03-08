
package ClasesTEMA4;

import org.junit.Test;
import static org.junit.Assert.*;
public class RestauranteV2Test {
    
     @Test
    public void testGetPrecio() {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
        assertEquals(5, r.getPrecio("bocadillo"));
        assertEquals(8, r.getPrecio("sopa"));
        assertEquals(10, r.getPrecio("filete"));
    }

    @Test
    public void testGetNombre() {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
        assertEquals("Casa Paco", r.getNombre());
    }

    @Test
    public void testEstaDisponible() {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
        assertTrue(r.estaDisponible("bocadillo"));
        assertTrue(r.estaDisponible("sopa"));
        assertTrue(r.estaDisponible("filete"));
    }

    @Test
    public void testGetPlatosCaros() {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
       // r.añadir("Entrecot", 20);
        assertEquals(0, r.getPlatosCaros().size());
        assertEquals("Entrecot", r.getPlatosCaros().get(0));
    }

    @Test
    public void testGetCuenta() {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
        assertEquals(23, r.getCuenta(new String[] { "bocadillo", "sopa", "filete" }));
    }
    
    /*@Test
    public void testGuardar() throws IOException {
          RestauranteV2 r = new RestauranteV2("Casa Paco");
          r.guardar();
    }*/
}
