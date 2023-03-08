
package ClasesTEMA4;


public class DNI {
    public int numero;
    public char letra;

    public DNI(int n, char l){
        numero=n;
        letra=l;
    }

    public DNI(String dni){			// new DNI("01234567A")
       /* String num=dni.substring(0,8);
        char l=dni.charAt(8);
        int n = Integer.parseInt(num);
        numero=n;
        letra=l;*/

        this(Integer.parseInt(dni.substring(0,8)),dni.charAt(8));
    }
}
