public class Ejercicio_35
{
    public static void main(String args[])
    {
        //Variables de gastos 
        int gastos_enero = 8000;
        int gastos_febrero = 9000;
        int gastos_marzo = 11000;
        int gastos_abril = 10000;
        int gastos_mayo = 12000;
        int gastos_junio = 10000;
        int gastos_julio = 9000;
        int gastos_agosto = 8000;
        int gastos_septiembre = 9000;
        int gastos_octubre = 9000;
        int gastos_noviembre = 12000;
        int gastos_diciembre = 14000;
        //Variables de ingresos
        int ingresos_enero =15000 ;
        int ingresos_febrero = 16000;
        int ingresos_marzo = 10000;
        int ingresos_abril = 9000;
        int ingresos_mayo = 12000;
        int ingresos_junio = 13000;
        int ingresos_julio = 7000;
        int ingresos_agosto = 6000;
        int ingresos_septiembre = 11000;
        int ingresos_octubre = 13000;
        int ingresos_noviembre = 14000;
        int ingresos_diciembre = 15000;
        // Apartado a, balance positivo o negativo
            if(ingresos_enero>gastos_enero){
                System.out.println("Balance de enero positivo");
            }else {
                System.out.println("Balance de enero negativo");
            }
              if(ingresos_febrero>gastos_febrero){
                System.out.println("Balance de febrero positivo");
            }else {
                System.out.println("Balance de febrero negativo");
            }  if(ingresos_marzo>gastos_marzo){
                System.out.println("Balance de marzo positivo");
            }else {
                System.out.println("Balance de marzo negativo");
            }  if(ingresos_abril>gastos_abril){
                System.out.println("Balance de abril positivo");
            }else {
                System.out.println("Balance de abril negativo");
            }  if(ingresos_mayo>gastos_mayo){
                System.out.println("Balance de mayo positivo");
            }else {
                System.out.println("Balance de mayo negativo");
            }  if(ingresos_junio>gastos_junio){
                System.out.println("Balance de junio positivo");
            }else {
                System.out.println("Balance de junio negativo");
            }  if(ingresos_julio>gastos_julio){
                System.out.println("Balance de julio positivo");
            }else {
                System.out.println("Balance de julio negativo");
            }  if(ingresos_agosto>gastos_agosto){
                System.out.println("Balance ed agosto positivo");
            }else {
                System.out.println("Balance de agosto negativo");
            }  if(ingresos_septiembre>gastos_septiembre){
                System.out.println("Balance de septiembre positivo");
            }else {
                System.out.println("Balance de septiembre negativo");
            }  if(ingresos_octubre>gastos_octubre){
                System.out.println("Balance de octubre positivo");
            }else {
                System.out.println("Balance de octubre negativo");
            }  if(ingresos_noviembre>gastos_noviembre){
                System.out.println("Balance de noviembre positivo");
            }else {
                System.out.println("Balance de noviembre negativo");
            }  if(ingresos_diciembre>gastos_diciembre){
                System.out.println("Balance de diciembre positivo");
            }else {
                System.out.println("Balance de diciembre negativo");
            }
   
         /*Apartado b. Media de ingresos y gastos.
         Media y total de ingresos*/
                int ingresos_totales = (ingresos_enero + ingresos_febrero + 
                        ingresos_marzo +ingresos_abril + ingresos_mayo + ingresos_junio + ingresos_julio + 
                        ingresos_agosto + ingresos_septiembre + ingresos_octubre + ingresos_noviembre + 
                        ingresos_diciembre);
                int gastos_totales = (gastos_enero + gastos_febrero + 
                        gastos_marzo +gastos_abril + gastos_mayo + gastos_junio + gastos_julio + 
                        gastos_agosto + gastos_septiembre + gastos_octubre + gastos_noviembre + 
                        gastos_diciembre);
                System.out.println("El total de ingresos es " + ingresos_totales );
                System.out.println("La media de ingresos es " + (ingresos_totales / 12));
                System.out.println("El total de gastos es " + gastos_totales );
                System.out.println("La media de gastos es " + (gastos_totales / 12));
         //Apartado c. Balance final anual. Positivo o no.
                int balance_final = (ingresos_totales - gastos_totales);
                System.out.println("El balance final es " + balance_final);
                if(balance_final<0){
                    System.out.println("El balance es negativo");
                }else{
                    System.out.println("El balance es positivo");
                }
                
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
 
        

        
    