/*Ejercicio 38 : Haz un programa que calcule las dos soluciones de la ecuación 𝑥
ଶ− 5𝑥 + 6=0*/
public class T2EJERCICIO38 {

    public static void main(String args[]) {
        System.out.println("La ecuación es x^2-5x+6=0");
        int A = 1;
        int B = -5;
        int C = 6;

        double potencia = Math.pow(B, 2);
        double raiz = potencia - 4 * A * C;
        //Tiene 2 soluciones, para la primera:
        double solucion1 = (-B + Math.sqrt(raiz)) / 2 * A;
        //para la segunda:
        double solucion2 = (-B - Math.sqrt(raiz)) / 2 * A;
        System.out.println("Las soluciones son: " + solucion1 + " y " + solucion2);
    }
}
