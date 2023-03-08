
package ClasesTEMA4;

import Restaurante.Restaurant;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public class RestaurantTest {
    @BeforeAll
    public void testGetPrecio() {
        Restaurant r = new Restaurant("El Pimpi");
        assertEquals(5, r.getPrecio("bocadillo"));
        assertEquals(8, r.getPrecio("sopa"));
        assertEquals(10, r.getPrecio("filete"));
    }

    @Test
    public void testGetNombre() {
        Restaurant r = new Restaurant("El Pimpi");
        assertEquals("El Pimpi", r.getNombre());
    }

    @Test
    public void testEstaDisponible() {
        Restaurant r = new Restaurant("El Pimpi");
        assertTrue(r.estaDisponible("bocadillo"));
        assertTrue(r.estaDisponible("sopa"));
        assertTrue(r.estaDisponible("filete"));
    }



    @Test
    public void testGetCuenta() {
        Restaurant r = new Restaurant("El Pimpi");
        assertEquals(23, r.getCuenta(new String[] { "bocadillo", "sopa", "filete" }));
    }
    
        /*@Test
    public void testGetPlatosCaros() {
        Restaurant r = new Restaurant("El Pimpi");
        assertEquals(1, r.getPlatosCaros().size());
        assertEquals("filete", r.getPlatosCaros().get(0));
    }*/
}
