
package ClasesTEMA4;

import java.util.ArrayList;
import java.util.List;


public record Empleado(String nombre, List<Empleado> subordinados) {
    public Empleado(String nombre){
        this(nombre,new ArrayList<>());
    } 
    public void mostrarSubordinados() {
        System.out.println(this.nombre);
        subordinados.get(subordinados.size()-1).mostrarSubordinados(1);
    }
    private void mostrarSubordinados(int tabs) {
        String guiones = " ";
        for(int j=0; j<tabs;j++){
            guiones+="-";
        }
        for (int i=0; i<subordinados.size();i++){
            System.out.println(guiones+subordinados.get(i).toString());
            tabs+=1;
        }
    }
}
