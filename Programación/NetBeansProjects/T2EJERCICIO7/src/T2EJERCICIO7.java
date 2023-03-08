/*Ejercicio 7 : Haz un proyecto nuevo y añade la librería “ObjetosSencillos.jar”. En dicha librería
encontrarás la clase DepósitoAgua. Haz un programa en el que haya un depósito de agua con
capacidad máxima 50 litros y capacidad inicial 15 litros. Dibújalo en la pantalla y calcula el
tanto por ciento de ocupación del depósito. */
import bpc.daw.objetos.*;
public class T2EJERCICIO7 {
    public static void main(String args[]) {
      DepositoAgua d= new DepositoAgua(15,50);
      d.dibujar();
      int cantidad= d.getCantidadActual();
      int capacidad= d.getCapacidadMaxima();
      int porcentaje=( (cantidad*100)/capacidad);
      System.out.println("El porcentaje ocupado es : "+porcentaje+"%");
    }
}
