
package ClasesTEMA4;

public class Fraccion {
    
    /*-------------------------Ejercicio 26-------------------------*/
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public int getNumerador(){
        return numerador;
    }
    
    public int getDenominador(){
        return denominador;
    }
    
    public double getValorReal(){
        double valorReal = this.numerador/this.denominador;
        return valorReal;
    }
    
    public Fraccion getInversa(){
        Fraccion f = new Fraccion(this.denominador,this.numerador);
        return f;
    }
    
    public static Fraccion sumar(Fraccion a, Fraccion b){
        Fraccion aMasB = new Fraccion((a.numerador*b.denominador+a.denominador*b.numerador),(a.denominador*b.denominador));
        return aMasB;
    }
    
    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        Fraccion aPorB = new Fraccion((a.numerador*b.numerador),(a.denominador*b.denominador));
        return aPorB;
    }
    
    public static Fraccion dividir(Fraccion a, Fraccion b){
        Fraccion aEntreB = new Fraccion((a.numerador*b.denominador),(a.denominador*b.numerador));
        return aEntreB;
    }
}
