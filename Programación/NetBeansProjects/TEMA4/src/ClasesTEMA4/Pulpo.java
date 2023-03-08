
package ClasesTEMA4;


public class Pulpo implements Nadador {

    @Override
    public void nadar() {
       System.out.println("El pulpo nada");

    }

    @Override
    public void sumergirse(int profundidad) {
       System.out.println("El pulpo se sumerge"+profundidad+"metros");

    }
    
}
