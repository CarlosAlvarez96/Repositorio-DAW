
package com.iesHlanz.Colegio;


public record Nota(double valorNumerico) {
    public Valoracion getValoracion(){
        Valoracion v = Valoracion.BIEN;
        if(this.valorNumerico<3){
            v= Valoracion.MUY_DEFICIENTE;
        }else if(this.valorNumerico>=3 && this.valorNumerico<5){
            v= Valoracion.INSUFICIENTE;
        }else if(this.valorNumerico>=5 && this.valorNumerico<6){
            v = Valoracion.SUFICIENTE;
        }else if(this.valorNumerico>=6 && this.valorNumerico<7){
            v = Valoracion.BIEN;
        }else if(this.valorNumerico>=7 && this.valorNumerico<9){
            v=  Valoracion.NOTABLE;
        }else if(this.valorNumerico>=9 && this.valorNumerico<=10){
            v= Valoracion.SOBRESALIENTE;
        }else{
            throw new IllegalArgumentException("La nota no es correcta");
        }
            return v;
    }

}
