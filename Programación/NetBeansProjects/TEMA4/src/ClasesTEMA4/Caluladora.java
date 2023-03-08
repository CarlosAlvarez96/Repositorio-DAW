package ClasesTEMA4;

//VERSIÓN ITERATIVA DE CALCULAR UNA POTENCIA
public class Caluladora {

    public int calcularPotenciaIterativa(int base, int exponente) {
        int acumulador = 1;
        for (int i = 0; i < exponente; i++) {
            acumulador *= base;
        }
        return acumulador;
    }

    //VERSION RECURSIVA (infinito, esta mal)
    //public calcularPotencia(int base, int exponente) {
    //  return calcularPotencia(base, exponente - 1) * base;
    //}
    //VERSION RECURSIVA DE CALCULAR POTENCIA
    public int calcularPotencia(int base, int exponente) {
        int resultado = 0;
        if (exponente == 1) {
            resultado = 1;
        } else {
            resultado = calcularPotencia(base, exponente - 1) * base;
        }
        return resultado;
    }

    //CALUCLA LA MULTIPLICACION SIN USAR ASTERISCO(asignacion condicional)
    public int multiplicar(int a, int b) {
        return b == 0 ? 0 : multiplicar(a, b - 1) + a;
    }

    /*--------------------EJERCICIO22--------------------*/
    public int Factorial(int n) {
        return n == 0 ? 1 : Factorial(n - 1) * n;
        
    }
/*----------------------EJERCICIO23--------------------*/
    public boolean esPar(int n) {
        return n== 0? true : !esPar(n-1);
    }
    
    /*-------------------EJERCICIO24-------------------*/
    
    
}
