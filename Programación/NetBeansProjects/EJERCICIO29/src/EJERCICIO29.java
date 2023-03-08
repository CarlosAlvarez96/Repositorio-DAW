import java.util.*;
//no funciona el boolean en el output
public class EJERCICIO29 {
    public static void main(String args[]) {
        System.out.println("¿Está la impresora encendida?");
        boolean impresoraencendida= new Scanner(System.in).nextBoolean();
        System.out.println("¿Cuál es el porcentaje de tinta?");
        int tinta= new Scanner(System.in).nextInt();
        System.out.println("¿Cuántos folios posee la impresora?");
        int foliosimpresora= new Scanner(System.in).nextInt();
        System.out.println("¿Cuántos folios desea imprimir?");
        int foliosimprimir= new Scanner(System.in).nextInt();
        if(impresoraencendida=true && tinta>0 && foliosimpresora>foliosimprimir){
            System.out.println("Se puede imprimir");
        }else if (impresoraencendida=false || tinta<0 || foliosimpresora<foliosimprimir ){
            System.out.println("No se puede imprimir");
       }
    }    
}
