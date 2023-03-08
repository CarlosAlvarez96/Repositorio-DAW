package ClasesTEMA4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Persona {
    
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;
   
    public Persona (String n,DNI d,double s,LocalDate fn){
        nombre=n;
        dni=d;
        if(s>0){
            sueldo=s;
        }else{
            sueldo=0;
        }
        fechaNacimiento=fn;
       
        cuenta=new CuentaCorriente();
    }
    
    public Persona(String n,int numDNI,char letraDNI, double s,LocalDate fn){
        this(n,new DNI(numDNI, letraDNI),900,LocalDate.now());
    }
    
    public Persona(String n,DNI d){
        this(n,d,900,LocalDate.parse("06/12/2002", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    public void aumentarSueldo(int por){
        if(por>0 && por<=100){
            sueldo+=(sueldo*por)/100;
        }
    }
    
    public void cobrarSueldo(){
        cuenta.saldo += sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public DNI getDNI(){
        return dni;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public CuentaCorriente getCuentaCorriente(){
        return cuenta;
    }
    boolean tieneDinero=false;
    public boolean tieneDinero(){
        boolean tieneDinero=false;
        if(cuenta.saldo>0){
            tieneDinero=true;
        }else{
            tieneDinero=false;
        }
        return tieneDinero;
    }
    
    public boolean esMileurista(){
        boolean esMileurista=false;
        if(sueldo>=1200){
            esMileurista=true;
        }else{
            esMileurista=false;
        }
        return esMileurista;
    }
}
