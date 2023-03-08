/*
Ejercicio 34: Calcula la suma de los cuadrados de los números comprendidos entre 5 y 13: 
52 +62+72+82+92+102+112+122+132 
 */
public class T3EJERCICIO34 {
    public static void main(String args[]) {
        int c=5;
        double x=0;
        for(double i=5;i<13;i++){
            x=Math.pow(c, 2);
            c+=1;
        System.out.println((int)x);
        }
    }
}
