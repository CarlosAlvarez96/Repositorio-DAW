
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Ejercicio 45 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y 
DayOfWeek. Haz un programa que muestre por pantalla el nombre del día de la semana que 
será el 28 de febrero de 2100. 
 */
public class T2EJERCICIO45 {
    public static void main(String args[]) {
        LocalDate fecha = LocalDate.of(2100,02,28);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("eeee");
        String dia = formato.format(fecha);
        System.out.println(dia);
        
    }
}
