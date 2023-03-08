
package ClasesAbstractas;

import java.awt.Color;

public class Programa {
    public static void main(String[] args) {
        Vehiculo c =new Coche("Ferrari",4,100,Color.RED);
        Vehiculo b = new Bici(Color.BLUE,true);
        
        c.mover(21, 31);
        b.mover(23, 02);
    }
}
