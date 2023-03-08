
import java.util.ArrayList;
import java.util.List;

/*
Haz un programa que muestre cuantos números negativos hay en la tabla:
5 3 5 8 
2 1 0 -1
5 3 
-1 0 1 1 5 2 5
0 2 -1 5
 */
public class T3EJERCICIOPROPUESTO {

    public static void main(String args[]) {
        int[][] lista = {
            {5, 3, 5, 8},
            {2, 1, 0, -1},
            {5, 3},
            {-1, 0, 1, 1, 5, 2, 5},
            {0, 2, -1, 5}
                
        };
        int acumulador=0;
        for(int i=0;i<lista.length;i++){
            for(int j=0;i<lista[i].length;j++){
                int dato=lista[i][j];
                if(dato<0){
                    acumulador++;
                }
            }
        }
        System.out.println(acumulador);
    }
}

List<String>filas=new ArrayList<>();
        List<String>col=new ArrayList<>();
        boolean alt = true;
        int num = 0;
        for (int i = 0; i < 4; i++) {
            int j=0;
            
           // col.add(filas.indexOf(j));
            for ( j = 0; j < 3; j++) {
                num = (int) (Math.random() * 10 + 1);
                if (num <= 5) {
                    alt = true;
                    filas.add("true");
                    //System.out.println(alt);
                }else{
                    alt=false;
                    filas.add("false");
                    //System.out.println(alt);
                }
            }
        }
        System.out.println(filas.toString());