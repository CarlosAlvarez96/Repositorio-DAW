import java.util.*;
public class EJERCICIO49 {
    public static void main(String args[]) {
        int [] suspensas= {3,8,2,0,0};
        String [] nombres={"Antonio","Jaime","Pedro","Manuel","Maite"};
        System.out.println("Introduzca un número de lista del 0 al 4: ");
        int numerolista= new Scanner(System.in).nextInt();
        if(numerolista=0){
            System.out.println("El alumno es "+nombres[0]);
        }else if(numerolista=1){
            System.out.println("El alumno es "+nombres[1]+"");
        }
        
        
    }
}
