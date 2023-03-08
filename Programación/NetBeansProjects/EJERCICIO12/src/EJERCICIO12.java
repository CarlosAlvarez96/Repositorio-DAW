import java.util.*;
public class EJERCICIO12 {
    public static void main(String args[]) {
        System.out.println("Introduzca un número con decimales");
        Double numero= new Scanner(System.in).nextDouble();
        System.out.println("Introduzca un porcentaje con decimales");
        Double porcentaje= new Scanner(System.in).nextDouble();
        System.out.println("Precio normal del artículo  "+numero+"  euros");
        System.out.println("Porcentaje de rebaja aplicado  "+porcentaje+"  %");
        System.out.println("Descuento aplicado   "+((numero/100)*porcentaje)+"  euros");
        System.out.println("Precio final del producto  "+(numero-(numero/100)*porcentaje)+"  euros");
        
        
        
                
    }
}
