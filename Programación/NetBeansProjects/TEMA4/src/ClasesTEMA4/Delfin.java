
package ClasesTEMA4;


public class Delfin implements Nadador, Saltador {

    @Override
    public void nadar() {
       System.out.println("El delfin nada");
    }

    @Override
    public void sumergirse(int profundidad) {
       System.out.println("El delfin se sumerge"+profundidad+"metros");
    }

    @Override
    public void saltar() {
       System.out.println("El delfin salta");
    }
    
}
