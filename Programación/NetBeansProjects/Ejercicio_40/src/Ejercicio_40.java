import java.util.*;
public class Ejercicio_40 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //No se que es sc
	int maximo;
                  int num;
                  int mayor=0;
	int cont;
 
        System.out.println("Inserte el máximo de números: ");
        maximo = sc.nextInt();
 
        for(cont = 0;cont < maximo;cont++ ){
        //No entiendo los simbolos ++ de la linea, el concepto si.
        System.out.println("Inserte un número: ");
        num = sc.nextInt();
        //desde aqui
        if(num>mayor)
        {
            mayor=num;
        }
    }
        //Hasta aquí (no entiendo)
    System.out.println("El mayor es "+mayor);
}
        }
   
