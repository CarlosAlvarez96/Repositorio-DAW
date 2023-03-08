
package ClasesTEMA4;

    //Ejercicio 37
    public interface Adinerado {
    public double getDineroTotal() ;
    public boolean añadirDinero(int cantidad) ;
    public boolean retirarDinero(int cantidad) ;
    
    //Ejercicio 38
    public static int TRANSFERENCIA_MINIMA=1526;
    public default boolean tieneDinero() {
        return this.getDineroTotal()>0;
    }
    
    // esta mal hasta el final, hay que poner un if en cada uno, no se puede usar asignacion condicional
    public default boolean transferirHacia(Adinerado receptor, double cantidad) {
        int cantidadInt = (int) Math.round(cantidad);
        this.retirarDinero(cantidadInt);
        receptor.añadirDinero(cantidadInt);
        return cantidad<this.getDineroTotal() || cantidad>TRANSFERENCIA_MINIMA;
    }
    public default boolean transferirDesde(Adinerado emisor, double cantidad) {
        int cantidadInt = (int) Math.round(cantidad);
        emisor.retirarDinero(cantidadInt);
        this.añadirDinero(cantidadInt);
        return cantidadInt<emisor.getDineroTotal() || cantidad>TRANSFERENCIA_MINIMA;
    }
    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
         int cantidadInt = (int) Math.round(cantidad);
         emisor.retirarDinero(cantidadInt);
         receptor.añadirDinero(cantidadInt);
          return cantidadInt<emisor.getDineroTotal() || cantidad>TRANSFERENCIA_MINIMA;
    }


}
