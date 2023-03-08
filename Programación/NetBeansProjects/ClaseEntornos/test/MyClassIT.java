
import org.junit.Test;
import static org.junit.Assert.*;


public class MyClassIT {
    
public class MyClassTest {
    @Test
    public void testSum() {
        MyClass myClass = new MyClass();
        int result = myClass.sum(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testDivide() {
        MyClass myClass = new MyClass();
        int result = myClass.divide(8, 4);
        assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        MyClass myClass = new MyClass();
        myClass.divide(4, 0);
    }
}
}
