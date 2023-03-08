
import java.util.Arrays;

/*
Ejercicio 25: Haz un programa en el que haya un array rellenado con 5000 ceros. A 
continuación el programa modificará las posiciones impares y guardará un 1 en ellas. Al 
terminar, se mostrarán todos los números del array en pantalla. 

 */
public class T3EJERCICIO25 {
    public static void main(String args[]) {
        
        int [] n=new int[5000];
        
        for(int i=1;i<n.length;i+=2){
            n[i]=1;
        }
        System.out.println(Arrays.toString(n));
    }
}
