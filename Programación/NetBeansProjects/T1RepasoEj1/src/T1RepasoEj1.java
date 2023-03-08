/*Ejercicio 1: En un instituto tenemos a los siguientes profesores, cuyas asignaturas y porcentajes de 
suspensos son:
Profesor Juan Manolo Hermenegildo Tim
% de alumnos suspensos 70 30 80 40
Haz un programa que muestre por pantalla el nombre de los profesores cuyo porcentaje de 
suspensos está por encima de la media.*/
public class T1RepasoEj1 {
    public static void main(String args[]) {
        String [] nombres={"Juan","Manolo","Hermenegildo","Tim"};
        double[] profesores={70,30,80,40};
        double media=(profesores[0]+profesores[1]+profesores[2]+profesores[3])/profesores.length;
        if(profesores[0]>media){
            System.out.println(nombres[0]);
        }
        if(profesores[1]>media){
            System.out.println(nombres[1]);
        }
        if(profesores[2]>media){
            System.out.println(nombres[2]);
        }
        if(profesores[3]>media){
            System.out.println(nombres[3]);
        }
        
    }
}
