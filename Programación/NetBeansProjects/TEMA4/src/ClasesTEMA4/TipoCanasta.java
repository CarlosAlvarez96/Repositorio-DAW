package ClasesTEMA4;


public enum TipoCanasta {
     TIRO_LIBRE,CANASTA_NORMAL,TRIPLE;
     
    public int getValor(){
        return ordinal()+1;
    }   
}
