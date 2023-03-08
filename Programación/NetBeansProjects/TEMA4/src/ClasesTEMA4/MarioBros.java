
package ClasesTEMA4;


public class MarioBros {


    public static void main(String args[]) {
        Personaje p= new Personaje ("Mario bros");
        PowerUp poder = PowerUp.getPowerAleatorio();
        System.out.println("Te ha tocado: "+poder.getNombre());
        poder.aplicar(p);
        System.out.println("HP: "+p.getPuntosVida());
    }
}
