
package Deposito;

public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
    }
    public DepositoAguaInmutable añadirLitro(){
        return new DepositoAguaInmutable(this.capacidadActual+1,this.capacidadMaxima);
    }
    public DepositoAguaInmutable retirarLitro(){
        return new DepositoAguaInmutable(this.capacidadActual-1,this.capacidadMaxima);
    }
}
