import java.time.*;
import java.time.format.DateTimeFormatter;
import static javax.print.attribute.Size2DSyntax.MM;

/*
Ejercicio 44 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y 
DateTimeFormatter. Haz un programa que muestre por pantalla la fecha actual en formato 
día/mes/año y después en formato día-mes-año. 
 */
public class T2EJERCICIO44 {
    public static void main(String args[]) {
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
         LocalDate fechahoy = LocalDate.now();
         String texto1 = fechahoy.format(formato1);
         String texto2 = fechahoy.format(formato2);
         System.out.println(texto1);
         System.out.println(texto2);
         
        
    }
}
