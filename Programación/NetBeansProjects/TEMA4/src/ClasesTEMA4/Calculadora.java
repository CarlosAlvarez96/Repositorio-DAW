package ClasesTEMA4;

public class Calculadora {
    
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
    
    public void ordenar(int[] array) {
        ordenar(array, 0);
    }

    private void ordenar(int[] array, int pos) {
        if (pos != array.length) {
            int min = array[pos];
            int posMin = pos;
            for (int i = pos; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    posMin = i;
                }
            }
            array[posMin] = array[pos];
            array[pos] = min;
            ordenar(array, pos + 1);
        }
    }

    public static void main(String... args) {
        int[] array = {5, 4, 3, 2, 1};
        Calculadora e = new Calculadora();
        e.ordenar(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
