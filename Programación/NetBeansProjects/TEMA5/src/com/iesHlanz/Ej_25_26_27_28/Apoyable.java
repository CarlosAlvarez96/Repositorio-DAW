
package com.iesHlanz.Ej_25_26_27_28;


public interface Apoyable extends FiguraGeometrica{
    public int getLongitudBase();
    public int getLongitudAltura();
    public default boolean esHorizontal(){
        return this.getLongitudBase()>this.getLongitudAltura();
    }
    public default boolean esVertical(){
        return this.getLongitudAltura()>this.getLongitudBase();
    }
    
}
