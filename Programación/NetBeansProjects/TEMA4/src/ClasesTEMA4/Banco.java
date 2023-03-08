
package ClasesTEMA4;

public class Banco implements Adinerado {
    private  double dinero;
    
    public Banco(){
        this.dinero=0;
    }

    @Override
    public double getDineroTotal() {
       return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        boolean añadir = true;
        if(dinero<0 || dinero<cantidad){
      this.dinero +=cantidad;
        }else{
            añadir = false;
        }
      return añadir;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        boolean añadir = true;
        if(dinero<0 || dinero<cantidad){
      this.dinero -=cantidad;
        }else{
            añadir = false;
        }
      return añadir;
    }
    
}
