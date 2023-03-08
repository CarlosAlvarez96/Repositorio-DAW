
package ClasesTEMA4;


public interface Saltador {
    public void saltar();
    public default void saltarMucho(int numeroSaltos){
        for(int i=0;i<numeroSaltos;i++){
            this.saltar();
        }
    }
}
