
package EfectoEspecial;


public class ProgramaFunciones {
    public static void main(String[] args) {
        /*
        Este programa crea las funciones:
        f(x) = 3x+2 ---> clases normales
        g(x) = cos(x) --> clase anónima 
        h(x) = 1/x --> Clase anónima
        y muestra en pantalla estos resultados
        f(0)
        g(pi)
        h(2)
        */
        FuncionF f = new FuncionF();
        System.out.println(f.calcularY(0));
        
        Funcion g = new Funcion("g"){
            @Override
            public double calcularY(double x) {
                return Math.cos(x);
            }   
        };
          Funcion h = new Funcion("h"){
            @Override
            public double calcularY(double x) {
                return 1/x;
            }
          };      
          System.out.println(g.calcularY(Math.PI));
          System.out.println(h.calcularY(2));
          
    }
}
