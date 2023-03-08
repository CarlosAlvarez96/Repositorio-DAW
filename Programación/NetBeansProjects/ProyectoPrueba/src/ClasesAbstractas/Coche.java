
package ClasesAbstractas;

import java.awt.Color;


public class Coche extends Vehiculo{
    private String matricula;
    private int potencia;
    
    public Coche(String m,int numeroPasajeros, int p, Color c) {
        super(numeroPasajeros, 120, c);
        this.matricula=m;
        this.potencia=p;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("El coche se mueve al punto "+x+" y "+y);
    }
    
    
}
