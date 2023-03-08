

/*
Ejercicio 43: Haz un programa que cree una tabla de 4 filas y 3 columnas rellenada con 
booleanos aleatorios. El programa mostrará la tabla en pantalla y después la recorrerá y nos 
dirá cuántos true y cuántos false hay en la tabla. 

 */
public class T3EJERCICIO43 {

    public static void main(String args[]) {
        Boolean[][] tabla = new Boolean[4][3];
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int num = (int) (Math.random() * 10 - 1);
                if (num <= 5) {
                    tabla[i][j] = true;
                } else {
                    tabla[i][j] = false;
                }
                System.out.println(tabla[i][j]);
            }
        }
    }
}
