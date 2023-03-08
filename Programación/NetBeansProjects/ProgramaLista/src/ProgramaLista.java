import java.util.*;
public class ProgramaLista {
    public static void main(String args[]) {
        String[] dias = {"lunes", "martes","miercoles","jueves","viernes","sabado","domingo"};
        dias[1]="MARTES";
        int [] pares = {0,2,4,6,8};
        int[] ceros = new int[1000];
        char [] vocales = {'a','e','i','o','u'};
        System.out.println(pares[2]);
        //preguntar un dato de la lista
        System.out.println(dias.length);
        //preguntar longitud de la lista
        System.out.println("introduce un numero del 1 al 6");
        int numero=new Scanner(System.in).nextInt();
        if(numero>=0 && numero<=6){
            System.out.println(dias[numero]);
        }else{
                    System.out.println("numero incorrecto");
                    //para consultar la posicion de una variable.En este caso nombre
                    }
         }
        
       }
        
                
    }

