
package Restaurante;


public class Futbolista {
    private int dorsal;
    private String nombre;
    
    public Futbolista(int d, String nombre){
        this.dorsal=d>1 && d<=11? d:1;
        this.nombre=nombre;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getPosicion(){
        String pos=" ";
        if(dorsal==1){
            pos="portero";
        }else if(dorsal>=2 && dorsal<=4){
            pos="defensa";
        }else if(dorsal>=5 && dorsal<=8){
            pos="mediocentro";
        }else if(dorsal>=9 && dorsal<=11){
            pos="delantero";
        }else{
            pos="desconocido";
        }
        return pos;
    }
    
    public long getSueldo(){
        Futbolista f = new Futbolista(0," ");
        String posicion =f.getPosicion();
        long sueldo=0;
        if(posicion.equals("portero")){
            sueldo=1_000_000;
        }else if(posicion.equals("defensa")){
            sueldo=3_000_000;
        }else if(posicion.equals("mediocentro")){
            sueldo=5_000_000;
    }else if(posicion.equals("delantero")){
        sueldo=10_000_000;
    }
        return sueldo;
  }
    
        /*----------------- Exceptions---------------------*/
    
    public Futbolista(String puesto, String nombre){
        this.nombre=nombre;
        int nDorsal=0;
        if(puesto.equals("portero")){
            nDorsal=1;
        }else if(puesto.equals("defensa")){
            nDorsal=(int) (Math.random()*4-2+2);
        }else if(puesto.equals("mediocentro")){
            nDorsal=(int) (Math.random()*8-5+5);
        }else if(puesto.equals("delantero")){
            nDorsal=(int) (Math.random()*11-8+8);
        }else{
            throw new IllegalArgumentException("Puesto incorrecto");
        }
        dorsal=nDorsal;
    }
}
