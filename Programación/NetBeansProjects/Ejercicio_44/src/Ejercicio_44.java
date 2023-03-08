import java.util.*;
public class Ejercicio_44 {
    public static void main(String args[]) {
        System.out.println("¿Cuál es el precio del producto? ");
        Double precioproducto = new Scanner(System.in).nextDouble();
        System.out.println("¿Cuánto dinero entrega el cliente? ");
        Double dineroentregado = new Scanner(System.in).nextDouble();
        Double diferencia = precioproducto - dineroentregado;
        if(precioproducto<dineroentregado){
            System.out.println("Sobran "+ (diferencia*-1) + "euros");
        }else {
            System.out.println("Falta dinero, en concreto: " + diferencia);
        }
    }
        
        
    
} 
