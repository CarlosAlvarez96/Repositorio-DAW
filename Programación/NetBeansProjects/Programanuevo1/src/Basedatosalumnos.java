import java.util.*;
public class Basedatosalumnos {
    
    public static void main(String args[]) {
        
        String[] nombres={"Belén", "Carlos", "José Antonio", "Miguel"};
        int[] notas={10,9,8,9};
        String[] localidades={"Almería","Granada","Motril","Madrid"};
        System.out.println("Introduce numero de lista ");
        int numeroLista = new Scanner(System.in).nextInt();
        if (numeroLista>=1 && numeroLista<nombres.length){
            numeroLista--;
            System.out.println("Nombre: "+nombres[numeroLista]);
            System.out.println("Nota: "+notas[numeroLista]);
            System.out.println("Localidad: "+ localidades[numeroLista]);
    }else{
            System.out.println("numero incorrecto");
        }
  }
}
