package Colegio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alumno {
    //Propiedades estáticas
    private static int totalAlumnos=0;
    private static List<Alumno> alumnosCreados=new ArrayList<>();
    
    //Propiedades(Atriutos, variables de instancia)
    private String nombre;
    private int edad;
    
    public Alumno(String n, int e){
        nombre = n;
        
        if(e>=4 && e<=50){
            edad = e;
        }else{
            throw new IllegalArgumentException("Edad incorrecta");
        }
        totalAlumnos++;
    }
    
    public Alumno(String n, int a, int b){
		 this(n,new Random().nextInt(a, b));
		
       
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getCursoRecomendado(){
        String curso = "";
        if(getEdad()<12){
            curso = "primaria";
        }else if(getEdad()==12){
            curso = "1º ESO";
        }else if(getEdad()==13){
            curso = "2º ESO";
        }else if(getEdad()==14){
            curso = "3º ESO";
        }else if(getEdad()==15){
            curso = "4º ESO";
        }else{
            curso = "enseñanza post obligatoria";
        }
        return curso;
    }
    
    public int getEdadRecomendada(String curso){
        int edad = 0;
        switch (curso) {
            case "primaria" -> edad = 8;
            case "1º ESO" -> edad = 12;
            case "2º ESO" -> edad = 13;
            case "3º ESO" -> edad = 14;
            case "4º ESO" -> edad = 15;
            case "enseñanza post obligatoria" -> edad = 16;
            default -> throw new IllegalArgumentException("curso incorrecto");
        }
        return edad;
        
    }
    
    //Métodos estáticos
    
    public static int getNumeroTotalAlumnos(){
        return totalAlumnos;
    }
    
    public static Alumno getAlumno(String nombre){
        Alumno a = null;
        for(Alumno i: alumnosCreados){
            String n= i.getNombre();
            if(n.equals(nombre)){
                a=i;
            }
        }
        return a; 
    }
}
