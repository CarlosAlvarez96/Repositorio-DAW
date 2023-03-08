/*
Ejercicio 22: Realiza un programa que calcule la suma de todos los números de esta lista:
2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6 
 */
public class T3EJERCICIO22 {

    public static void main(String args[]) {
        int a[] = {2, 9, 4, 5, 6, 1, 2, 3, 45, 2, 1, 2, 65, 3, 2, 6, 1, 2, 3, 5, 2, 2, 6, 67, 11, 67, 3, 2, 1, 7, 8, 5, 3, 27, 8, 93, 1, 6};
        int total = 0;
        for (int i = 0; i <a.length ; i++) {
            total += a[i];
        }
        System.out.println(total);
    }
}
