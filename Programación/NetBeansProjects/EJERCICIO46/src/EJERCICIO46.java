        import java.util.*;
        public class EJERCICIO46 {
            public static void main(String args[]) {
                System.out.println("Introduzca su año de nacimiento: ");
                int año= new Scanner(System.in).nextInt();
                System.out.println("¿Eres un hombre?(true or false): " );
                boolean genero= new Scanner(System.in).nextBoolean();
                System.out.println("Introduzca su altura en metros");
                double estatura= new Scanner(System.in).nextDouble();
                System.out.println("Introduzca su peso en kg: ");
                double peso= new Scanner(System.in).nextDouble();
                int edad=2022-año;
                double imc=(peso/(estatura*estatura));
                
                
                if(genero=true){
                        System.out.println("Su frecuencia cardíaca es: "+(220-edad));
                }else{
                        System.out.println("Su frecuencia cardíaca es: "+(226-edad));
                }
                        System.out.println("Su IMC es: "+imc);
                        
                        
                if(imc>16){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez severa");
                }else if(imc>=16 && imc<17){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");
                }else if(imc>=17 && imc<18,5){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");
                }else if(imc>=18,50 && imc<24,5){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");
                }else if(imc>=25 && imc<30){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");       
                }else if(imc>=30 && imc<35){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");
                }else if(imc>=35 && imc<40){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");
                }else if (imc<40){
                        System.out.println("Según la OMS su estado es Infrapeso: delgadez moderada");        
                        }
                
            }
        }