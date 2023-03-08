package ClasesTEMA4;

import org.junit.Test;
import static org.junit.Assert.*;

public class AltavozIT {

    public AltavozIT() {
    }



public class AltavozTest {

    @Test
    public void testAltavozInitialVolume() {
        Altavoz altavoz = new Altavoz();
        assertEquals(Altavoz.VOL_MIN, altavoz.getVolumen());
    }

    @Test
    public void testAltavozMaxVolume() {
        Altavoz altavoz = new Altavoz();
        altavoz.ponerVolumenMaximo();
        assertEquals(Altavoz.VOL_MAX, altavoz.getVolumen());
    }

    @Test
    public void testSetVolumeOutOfBoundsThrowsException() {
        Altavoz altavoz = new Altavoz();
        try {
            altavoz.setVolumen(Altavoz.VOL_MIN - 1);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected exception
        }
    }

}

}
