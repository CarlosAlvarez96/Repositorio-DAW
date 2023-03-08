
package EfectoEspecial;


public class FuncionF extends Funcion {

    public FuncionF(){
        super("f");
    }
    @Override
    public double calcularY(double x) {
        return 3*x+2;
    }
    
}
