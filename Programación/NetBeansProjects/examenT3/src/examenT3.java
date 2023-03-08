
import java.util.Random;


public class examenT3 {

    public static void main(String args[]) {
        String[] nombres = {"Manuel", " Ana", "Jose", "Luis", "Maria", "Jaime", "Lola", "Antonio", "Barbara", "Lucia"};
        String[] apellidos = {"Ruiz", "Perez", "Garcia", "Rodriguez", "Fernandez"};
        boolean repetir = true;
        int contador = 0;
        while (repetir) {
            int r = (int) (Math.random()*10-1);
            int p = (int) (Math.random()*5-1);
            int q = (int) (Math.random()*5-1);

            if (nombres[r].equals(nombres[1]) || nombres[r].equals(nombres[4]) || nombres[r].equals(nombres[6]) || nombres[r].equals(nombres[8]) || nombres[r].equals(nombres[9])) {
                contador++;
            }
            System.out.println(nombres[r].toString());
            System.out.println(apellidos[p].toString());
            System.out.println(apellidos[q].toString());
            if (contador == 10) {
                repetir = false;
            }
        }
    }
}
