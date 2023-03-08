
package Examen;

import bpc.hlanz.validadordni.DNIIncorrectoException;
import bpc.hlanz.validadordni.Pais;
import bpc.hlanz.validadordni.ValidadorDNI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Alumno implements PoseedorFaltas{

    private String dni;
    private String nombre;
    private List<Falta> faltas;
    
    public Alumno(String nombre, int numeroDni, char letraDni) throws DNIIncorrectoException{
        this.faltas= new ArrayList<>();
        this.dni=" "+numeroDni+letraDni;
        this.nombre=nombre;
         ValidadorDNI vdni =  ValidadorDNI.getInstancia(Pais.ESPAÑA);
         vdni.setNumero(numeroDni);
         vdni.setLetra(letraDni);
         vdni.validarDNI();
         
    }
    public Alumno(String nombre, String dni) throws DNIIncorrectoException{
        this.dni= dni;
        this.nombre=nombre;
        this.faltas=new ArrayList<>();
        String numero= null;
        String letra= null;
        
        for(int i = 0; i<dni.length();i++){
            if(i<8){
                numero += dni.charAt(i);
            }
            if(i==8){
                letra += dni.charAt(i);
            }
        }
        char[] c = letra.toCharArray();
        char letraDni = c[0];
        int numeroDni = Integer.parseInt(numero);
        ValidadorDNI vdni =  ValidadorDNI.getInstancia(Pais.ESPAÑA);
        vdni.setNumero(numeroDni);
         vdni.setLetra(letraDni);
         vdni.validarDNI();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void ponerFalta(Falta f){
        LocalDate fecha= f.fecha();
        int hora=f.hora();
        boolean comparador = false;
        for(Falta i : this.faltas){
            if(i.fecha().equals(fecha) && i.hora()==hora){
                comparador=true;
            }
        }
        if(f.alumno().getDni().equals(this.dni) &&  comparador== true){
            this.faltas.add(f);
        }else{
            throw new IllegalArgumentException("No se puede poner falta");
        }
    }
    public void justificarFalta(LocalDate dia, int hora){
        for(Falta i : this.faltas){
            if(!i.fecha().equals(dia) && i.hora()!=hora){
                throw new IllegalArgumentException("No hay ninguna falta en ese dia y hora");
            }else if(i.fecha().equals(dia) && i.hora()==hora && !i.tipo().INJUSTIFICADA){
                throw new IllegalArgumentException("La falta en ese dia y hora no es injustificada");
            }else if((i.fecha().equals(dia) && i.hora()==hora && i.tipo().INJUSTIFICADA){
                i.
            }
        }
    }
    public  TipoAsistencia getTipoAsistencia(LocalDate fecha){
        for(int i =0; i<this.faltas.size();i++){
            if(this.faltas.get(i).fecha().isAfter(fecha) && this.faltas.get(i).fecha().isBefore(fecha) || this.faltas.get(i).tipo().RETRASO){
                
            }
        }
        if(this.faltas.)
    }
    
    @Override
    public List<Falta> getFaltas() {
        return this.faltas;
    }
    
}
