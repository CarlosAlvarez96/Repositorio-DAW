
package ClasesTEMA4;

import org.junit.Test;
import static org.junit.Assert.*;

public class MarcadorFacilTest {
    
    public MarcadorFacilTest() {
    }

    @Test
    public void testSomeMethod() {
        MarcadorFacil m = new MarcadorFacil("CB Granada","CB Armilla");
        m.añadirCanasta(tipoEquipo.LOCAL, TipoCanasta.TRIPLE);
        m.añadirCanasta(tipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
        assertEquals(3,m.getPuntos(tipoEquipo.LOCAL));
        assertEquals(1,m.getPuntos(tipoEquipo.VISITANTE));
        assertEquals("CB Granada",m.getNombreEquipo(tipoEquipo.LOCAL));
        assertEquals("CB Armilla",m.getNombreEquipo(tipoEquipo.VISITANTE));
        
    }
    
}
