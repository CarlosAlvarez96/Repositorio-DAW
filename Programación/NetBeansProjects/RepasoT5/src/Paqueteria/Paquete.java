
package Paqueteria;

import java.util.Objects;


public class Paquete implements Comparable<Paquete>{

    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;
    private String producto;
    private String direccionDestino;
    private int prioridad;
    
    public Paquete(String pro, String dd, int pri){
        this.direccionDestino = dd;
        this.producto=pro;
        if(pri > 0 && pri < 4){
        this.prioridad=pri;
        }else {
            throw new IllegalArgumentException("Nivel de prioridad no valido");
        }
    }

    public String getProducto() {
        return producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.producto);
        hash = 11 * hash + Objects.hashCode(this.direccionDestino);
        hash = 11 * hash + this.prioridad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) obj;
        if (this.prioridad != other.prioridad) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return Objects.equals(this.direccionDestino, other.direccionDestino);
    }

    @Override
    public int compareTo(Paquete p) {
        return this.prioridad-p.prioridad;
    }

    
    
}
