
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
public class CuentaTest {
    
    public CuentaTest() {
    }
    private Cuenta cuenta;
    @BeforeAll
    public void nuevaCuenta(){
        cuenta = new Cuenta("ES21099865462528660871295",100);
    }

    @Test
    public void testGetSaldo() {
        Cuenta cuenta1 = new Cuenta("ES21099865462528660871295",100);
        float saldo = cuenta1.getSaldo();
        assertEquals(100,saldo,0.2);
    }
        @Test
    public void testSetSaldo() {
        Cuenta cuenta1 = new Cuenta ("ES21099865462528660871295",0);
        cuenta1.setSaldo(100);
        assertEquals(100,cuenta1.getSaldo(),02);
    }
        @Test
    public void testIngresarDinero() {
        Cuenta cuenta1 = new Cuenta ("ES21099865462528660871295",100);
        cuenta1.ingresarDinero(400);
        assertEquals(500,cuenta1.getSaldo(),02);
    }
       
    @Test 
    public void testExtraerDinero(){
        try{
            Cuenta cuenta1 = new Cuenta ("ES21099865462528660871295",100);
            cuenta1.extraerDinero(120);
            fail("Error. Se debería haber lanzado una excepción al resultar un saldo negativo");
        }catch(ArithmeticException ae){
            //Prueba correcta
        }
    }
}
