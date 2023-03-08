
package ClasesTEMA4;

import org.junit.Test;
import static org.junit.Assert.*;


public class MarcadorDefinitivoTest {
    
    public MarcadorDefinitivoTest() {
    }

    @Test
    public void testSomeMethod() {
        MarcadorDefinitivo marcador = new MarcadorDefinitivo("CB Betis","CB Alcoyano");
        marcador.añadirCanasta(tipoEquipo.LOCAL, TipoCanasta.TRIPLE);
        marcador.añadirCanasta(tipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
        assertEquals(3,marcador.getPuntos(tipoEquipo.LOCAL));
        assertEquals(1,marcador.getPuntos(tipoEquipo.VISITANTE));
        assertEquals("CB Betis",marcador.getNombreEquipo(tipoEquipo.LOCAL));
        assertEquals("CB Betis",marcador.getNombreEquipo(tipoEquipo.VISITANTE));
    }
    
}
