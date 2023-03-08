
package Restaurante;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    
    public RestauranteTest() {
    }

    @Test
    public void testSomeMethod() {
        Restaurante r=new Restaurante("HLANZ");
        assertEquals("HLANZ",r.getNombre());
        
        assertTrue(r.estaDisponible("sopa"));
    }
    
}
