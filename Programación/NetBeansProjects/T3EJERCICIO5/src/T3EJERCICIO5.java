/*
Ejercicio 5: Realiza un programa que genere números enteros aleatorios entre 0 y 10 y los 
muestre por pantalla. El programa terminará cuando el número generado sea el 10. 
 */
public class T3EJERCICIO5 {
    public static void main(String args[]) {
        int numeros = 1;
        while(numeros!=10){
            int numeros = (int) (Math.random()*10+1);
        }
    }
}
