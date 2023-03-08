
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EXAMEN_EJERCICIO_4 {

    public static void main(String args[]) {
        System.out.println("Introduzca una fecha de nacimiento tipo: aa/bb/cccc");
        String fecha = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(fecha, "/");
        String sDia = st.nextToken();
        String sMes = st.nextToken("/");
        String sAño = st.nextToken("/");
        if (sDia.length() != 2 || sMes.length() != 2 || sAño.length() != 4) {
            System.out.println("Error en el formato");
        } else {
            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(fecha, dt);
            int dia = ld.getDayOfMonth();
            int mes = ld.getMonthValue();
            int año = ld.getYear();
            int totalDias = 2022 * 365 + 11 * 30 + 14;
            int dias = dia + mes * 12 + año * 365;
            int dif = totalDias - dias;
            int edad = (int) dif / 365;
            System.out.println(edad);
            System.out.println(sAño);
        }

    }
}
