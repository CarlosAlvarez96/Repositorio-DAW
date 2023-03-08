import java.util.*;
public class EJERCICIO47 {
    public static void main(String args[]) {
        char caracter='A';
        int ascii=(int) caracter;
        System.out.println("med"+ascii);
        if(ascii>64 && ascii<91 || ascii>96 && ascii<123){
            System.out.println("El caracter corresponde a una letra");
        }else{
            System.out.println("El caracter no corresponde a una letra");
        }
        
        
    }
}
