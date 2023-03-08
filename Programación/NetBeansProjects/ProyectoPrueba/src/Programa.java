
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Programa {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Localidad gr = new Localidad(1,"Granada");
        Localidad ma = new Localidad(2,"Málaga");
        Localidad ja = new Localidad(3,"Jaén");

        lista.add( new Persona("Jose",30,LocalDate.now().minusYears(30)),gr);
        lista.add( new Persona("Maria",20,LocalDate.now().minusYears(20)),ma);
        lista.add( new Persona("Antonio",80,LocalDate.now().minusYears(80)),ja);
        lista.add( new Persona("Ana",50,LocalDate.now().minusYears(50)),ma);
        lista.add( new Persona("Hermenegildo",120,LocalDate.now().minusYears(120)),gr);

        //Vamos a ordenar la lista
        //Collections.sort(lista);
        
        //Ahora se ordena por edad
        ComparadorPersonasEdad comparador = new ComparadorPersonasEdad();
        Collections.sort(,comparador);

        for(Persona i : lista){
           /* System.out.println(i.getNombre()
                                            +"..."
                                            +i.getEdad()
                                            +"..."
                                            +i.getFechaNacimiento()
            
            );*/
            System.out.println("%s ... %d... %s".formatted(i.getNombre(),i.getEdad(),i.getFechaNacimiento().toString()));
        }
        
    }
}
