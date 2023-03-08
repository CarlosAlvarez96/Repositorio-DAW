
import java.util.ArrayList;
import java.util.*;


public class newJavaFile {
    public static void main(String args[]) {
        List <String> palabras =new ArrayList<>();
        palabras.add("Bulldog");
        palabras.add("Salchicha");
        palabras.add("Caniche");
        palabras.add("Pastor");
        palabras.add("Pomerania");
        palabras.add("Labrador");
        int vidas=4;
        Collections.shuffle(palabras);
        String palabra = palabras.get(0);
        palabras.remove(0);
        int letras = palabra.length();
        boolean [] aciertos =new boolean [letras];
        System.out.println(aciertos.toString());
        String vistaUsuario = palabra;
            for(int j = 0; j<aciertos.length;j++){
                char k =vistaUsuario.charAt(j);
                char t = palabra.charAt(j);
                if(aciertos[j]=true){
                    vistaUsuario.replace(k, '-');
                }else{
                    vistaUsuario.replace(k, t);
                }
            }
                        System.out.println(vistaUsuario);

        
        
        
    }
}
