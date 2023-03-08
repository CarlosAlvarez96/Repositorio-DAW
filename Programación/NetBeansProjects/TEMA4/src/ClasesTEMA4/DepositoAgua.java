package ClasesTEMA4;

public record DepositoAgua(int capacidadActual, int capacidadMaxima) {

    public DepositoAgua  {
        if (capacidadActual < 0 || capacidadMaxima < 0) {
            throw new IllegalArgumentException("No pueden ser negativos");
        }
        if (capacidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("La capacidad actual no puede ser mayor a la máxima");
        }
    }

    public DepositoAgua(int capacidadMaxima) {
        this(0,capacidadMaxima);
    }

    public DepositoAgua añadirLitro() {
        return new DepositoAgua(capacidadActual+1,capacidadMaxima);
    }

    public DepositoAgua retirarLitro() {
            return new DepositoAgua(capacidadActual-1,capacidadMaxima);

    }

    public int getPorcentaje() {
        return (capacidadActual/capacidadMaxima)*100;
    }
}
