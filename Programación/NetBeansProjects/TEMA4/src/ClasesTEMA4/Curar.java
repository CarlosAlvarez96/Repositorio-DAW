
package ClasesTEMA4;


public class Curar implements PowerUp{

    @Override
    public String getNombre() {
        return "curacion";
    }

    @Override
    public void aplicar(Personaje p) {
        p.setPuntosVida(100);
    }
    
}
