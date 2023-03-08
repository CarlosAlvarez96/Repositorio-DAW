
public class Cuenta {
    private String número;  //Numero de la cuenta bancaria
    private float saldo;        //Saldo de la cuenta bancaria en euros
    
    public Cuenta(String numCta, float saldoCta){
        this.número=numCta;
        this.saldo = saldoCta;
    }
    public String getNúmero(){
        return this.número;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setNúmero(String numCta){
        this.número=numCta;
    }
    public void setSaldo(float saldoCta){
        this.saldo=saldoCta;
    }
    public void ingresarDinero(float importe){
        this.saldo=saldo + importe;
    }
    public void extraerDinero(float importe){
        if((saldo - importe)<0){
            throw new java.lang.ArithmeticException("Saldo negativo");
        }else{
            this.saldo=saldo - importe;
        }
    }
    public void mostrarCuenta(){
        System.out.println("Nº cuenta "+ getNúmero());
        System.out.println("Saldo : "+ getSaldo()+ " €");
    }
    
}
