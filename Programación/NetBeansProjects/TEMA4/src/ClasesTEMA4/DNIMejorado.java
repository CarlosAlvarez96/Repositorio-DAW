
package ClasesTEMA4;

/*-------------------Ejercicio16------------------*/

public class DNIMejorado {
    private int número;
    private char letra;
    
    public DNIMejorado(int n){
        char l=this.calcularLetra(n);
        this.número=n;
    }
    
    public int getNumero(){
        return this.número;
    }
    
    public char getLetra(){
        return this.letra;
    }
    
    private char calcularLetra(int n){
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = n % 23;
        char letra = letrasDNI.charAt(indice);
        return letra;
    }
    
}
