package com.iesHlanz.Colegio;

import java.util.ArrayList;
import java.util.List;

public class Porgrama {

    public static void main(String[] args) {
        // Empleados
        DirectorColegio director = new DirectorColegio("Antonio", "IES Granada Capital");
        JefeEstudios jefeEstudios = new JefeEstudios("Alberto", "IES Granada Capital");
        //Profesores
        Profesor profeMates = new Profesor("Luis", "Matematicas");
        Profesor profeHistoria = new Profesor("Juan", "Historia");
        //Notas-Aluimnos
        List<Nota> notasAna = new ArrayList<>();
        Alumno Ana = new Alumno("Ana", notasAna);
        List<Nota> notasRafael = new ArrayList<>();
        Alumno Rafael = new Alumno("Ana", notasRafael);
        List<Nota> notasJorge = new ArrayList<>();
        Alumno Jorge = new Alumno("Ana", notasJorge);
        //Array de alumnos 
        Alumno[] hijosJulia = {Ana, Rafael};
        Alumno[] hijosJaime = {Jorge};
        //Tutores de Alumnos
        TutorLegal tutoraJulia = new TutorLegal("Julia", hijosJulia);
        TutorLegal tutorJaime = new TutorLegal("Julia", hijosJaime);
        //Notas
        Nota AnaMates = new Nota(10);
        profeMates.calificar(Ana, AnaMates.valorNumerico());
        jefeEstudios.recibirCalificacion(profeMates, Ana, AnaMates);
        Nota AnaHistoria = new Nota(4);
        profeHistoria.calificar(Ana, AnaHistoria.valorNumerico());
        jefeEstudios.recibirCalificacion(profeHistoria, Jorge, AnaHistoria);
        Nota RafaelMates = new Nota(3);
        profeMates.calificar(Rafael, RafaelMates.valorNumerico());
        jefeEstudios.recibirCalificacion(profeHistoria, Jorge, RafaelMates);
        Nota JorgeHistoria = new Nota(2);
        profeHistoria.calificar(Jorge, JorgeHistoria.valorNumerico());
        jefeEstudios.recibirCalificacion(profeHistoria, Jorge, JorgeHistoria);

        //nota media de cada alumno, la del colegio y el número de suspensos de matemáticas y de historia.
        System.out.println("Media de Ana: " + Ana.getNotaMedia() + "\n"
                + "Media de Rafael: " + Rafael.getNotaMedia() + "\n"
                + "Media de Jorge: " + Jorge.getNotaMedia() + "\n"
                + "Media del colegio: " + director.getNotaMediaColegio() + "\n"
                + "Suspensos Matematicas: " + jefeEstudios.getNumeroSuspensos("Matematicas") + "\n"
                + "Suspensos Historia: " + jefeEstudios.getNumeroSuspensos("Historia")
        );
    }
}
