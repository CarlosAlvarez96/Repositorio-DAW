
package ClasesAbstractas;

import java.awt.Color;


public class Bici extends Vehiculo{
    private boolean timbre;
    
    public Bici(Color c,boolean timbre){
        super(1,45,c);
        this.timbre=timbre;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("La bici se mueve al punto "+x+" y "+y);
    }
}
