
package ClasesTEMA4;


public class Veneno implements PowerUp{

    @Override
    public String getNombre() {
            return "seta veneno";
    }

    @Override
    public void aplicar(Personaje p) {
        p.setPuntosVida(p.getPuntosVida()-10);
        p.setPuntosAtaque(p.getPuntosAtaque()-20);
      }
    
}
