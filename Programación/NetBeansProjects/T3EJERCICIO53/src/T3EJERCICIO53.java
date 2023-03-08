
import java.util.HashSet;
import java.util.Set;

public class T3EJERCICIO53 {

    public static void main(String args[]) {
        Set<String> set = new HashSet<>();
        set.add("palabra");
        set.add("pene");
        set.add("albdejiw");
        set.add("ujcreb");
        set.add("clmew");
        set.add("lcme");
        set.add("lmrcelc");
        set.add("mcepl");
        set.add("ofceropj");
        for (String i : set) {
            System.out.println(i.toUpperCase());
            System.out.println(i);
            System.out.println(i.length());

        }
    }
}
