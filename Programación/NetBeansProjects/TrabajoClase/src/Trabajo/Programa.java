package Trabajo;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {

        boolean repetir = true;
        while (repetir) {

            CatalogoTitulos ct = new CatalogoTitulosFichero("C://Users//CARLOS//Desktop//titulos_daw.txt");
            System.out.println("""
                           1. Añadir título
                           2. Consultar todos los títulos
                           3. Cambiar estado del título
                           4. Salir
						   """);
            int sc = new Scanner(System.in).nextInt();
            if (sc == 1) {
                System.out.println("Introduzca DNI");
                String DNI = new Scanner(System.in).nextLine();
                System.out.println("Introduzca nombre");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduzca estudios");
                String estudios = new Scanner(System.in).nextLine();
                System.out.println("Introduzca estado (SIN_RECIBIR, RECIBIDO, RECOGIDO)");
                String estado = new Scanner(System.in).nextLine();
                ct.añadirTitulo(DNI, nombre, estudios, Estado.valueOf(estado));
            } else if (sc == 2) {
                for (int i = 0; i < ct.getTitulos().size(); i++) {
                    System.out.println(ct.getTitulos().get(i).toString());

                }
            } else if (sc == 3) {
                System.out.println("Introduzca DNI");
                String DNI = new Scanner(System.in).nextLine();
                try {
                    Titulo t = ct.getTitulo(DNI);
                    System.out.println("Introduzca nuevo estado  (SIN_RECIBIR, RECIBIDO, RECOGIDO)");
                    String NuevoEstado = new Scanner(System.in).nextLine();
                    Estado estadoNuevo = Estado.valueOf(NuevoEstado);
                    t.setEstado(estadoNuevo);
                } catch (NoSuchElementException error) {
                    System.out.println("dni no encontrado");
                }
            } else if (sc == 4) {
                ct.guardar();
                repetir = false;
            }

        }

    }
}

