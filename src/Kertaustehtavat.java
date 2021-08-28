import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
public class Kertaustehtavat {

    static Integer[] luoUusi(int n){
     Integer[] taulukko = new Integer[]{};
     Random satunnaisluku = new Random();
        ArrayList siirtaja = new ArrayList();


     IntStream.range(0, n).forEach(
             siirtaja.add(satunnaisluku.nextInt(n))
     );
     return taulukko;
    }

    public static void main(String[] args) {

    }
}
