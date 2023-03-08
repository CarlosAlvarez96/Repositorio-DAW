
import static java.lang.Math.atan;
import java.text.NumberFormat;

/*
Ejercicio 43 : Consulta el pdf de la “Librería Estándar de Java” y busca las clases Math y 
NumberFormat. Haz un programa que calcule el valor del número pi usando la siguiente 
fórmula: 𝜋 = 4 ∗ 𝑎𝑟𝑐 𝑡𝑔(1) y muestre el valor usando 4 cifras decimales. 
 */
public class T2EJERCICIO43 {

    public static void main(String args[]) {
        
        double formula = (4*(atan(1))); //la formula de pi
        NumberFormat numero = NumberFormat.getInstance();//creo un formato de numero con el static
        numero.setMaximumFractionDigits(4);//le pongo al formato de numero un maximo de 4 decimales con el metodo set...
        String pi = numero.format(formula);//Creo un string aplicandole el formato de mi double que es la formula de pi
        System.out.println(pi);
        
    }
}
