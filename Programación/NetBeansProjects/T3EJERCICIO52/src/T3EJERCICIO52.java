
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import static java.nio.file.Files.readAllLines;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class T3EJERCICIO52 {
    public static void main(String args[]) {
        try {
            List<String> lista = readAllLines(Paths.get("C:/Users/CARLOS/Desktop/palabras.txt"));
            for(String i:lista){
                System.out.println(i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
