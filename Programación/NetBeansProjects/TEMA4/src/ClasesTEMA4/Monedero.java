
package ClasesTEMA4;


public class Monedero implements Adinerado {
    private double dinero;
    
    public Monedero(){
        this.dinero=0;
    }

     @Override
    public double getDineroTotal() {
       return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
      this.dinero +=cantidad;
      return cantidad<=0 || dinero+cantidad>1000? false: true;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        this.dinero -= cantidad;
        return dinero<cantidad? false : true;
    }
}
