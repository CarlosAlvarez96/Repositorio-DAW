import ClasesTEMA4.Caja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class CajaT {
    public CajaT(){

    }
    @Test
    public void test(){
        Caja b = new Caja();
        assertEquals(false, b.abierto);;
    }
    
}
