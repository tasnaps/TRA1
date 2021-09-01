import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kertaustehtavat {

    // a) Method for creating arrays
    static Integer[] luoUusi(int n){
     Integer[] taulukko = new Integer[n];
     Random satunnaisluku = new Random();
     List<Integer> list = new ArrayList<Integer>();
     for(int x = 0; x<n; x++){
         list.add(satunnaisluku.nextInt(n));
         taulukko[x] = satunnaisluku.nextInt(n);
     }
     return taulukko;
    }

    // b)  Method for summing indexes of array
    static int summa(Integer[] A){
        int summa = 0;
        for(int i=0; i<A.length; i++){
            summa += A[i];
        }
        return summa;
    }

    // d) Method for removing the smallest number
    static Integer poistaPienin(Integer[] A){
        int indeksi= 0;
        int pienin= Integer.MAX_VALUE;
        int total = A.length;
        int palautusInd = 0;

        while(indeksi<total){
            try {
                if((pienin>A[indeksi])){
                    pienin = A[indeksi];
                    palautusInd = indeksi;
                }
                indeksi++;
            } catch (NullPointerException exception){
                indeksi++;
            }
        }

        A[palautusInd] = null;
        return pienin;
    }

    // e)
    static Integer[] jarjesta(Integer[] A){
        //Kopiolista jottei poisteta vanhaa listaa
        Integer [] tyokaluLista = new Integer[A.length];
        for(int i = 0; i<A.length; i++){
            tyokaluLista[i] = A[i];
        }
        Integer[] jarjestettyLista = new Integer[A.length];
        for (int i = 0; i<A.length; i++){
                jarjestettyLista[i] = Kertaustehtavat.poistaPienin(tyokaluLista);
        }
        return jarjestettyLista;
    }


    static boolean onkoKasvava(Integer[] A){
        Integer [] tarkistus2 = new Integer[A.length];
        for(int i = 0; i<A.length; i++){
            tarkistus2[i] = A[i];
        }
        Kertaustehtavat.jarjesta(tarkistus2);

        if(Arrays.equals(A, tarkistus2)){
            return true;
        }else {
            return false;
        }
    }
    //Tää metodi ei toimi oikein. Varmaan nestatuilla loopeilla saa oikein
    static boolean onkoSamat(Integer[]A, Integer[] B){
        Integer[]tarkistus1 = new Integer[A.length];
        Integer[]tarkistus2 = new Integer[B.length];

        Kertaustehtavat.jarjesta(tarkistus1);
        Kertaustehtavat.jarjesta(tarkistus2);

        Integer[]tarkistus3 = new Integer[A.length];
        Integer[]tarkistus4 = new Integer[B.length];


        //A Kopiointi
        for(int i = 0; i<A.length; i++){
            tarkistus3[i] = A[i];
        }
        //B Kopiointi
        for(int i = 0; i<B.length; i++){
            tarkistus4[i] = B[i];
        }

        if(Arrays.equals(tarkistus3, tarkistus4)){
            return true;
        } else {
            return false;
        }

    }



    public static void main(String[] args) {
        Integer[] testiTaulukko = luoUusi(10);
        //System.out.println(Arrays.toString(testiTaulukko));
        //System.out.println(summa(testiTaulukko));
        //System.out.println(poistaPienin(testiTaulukko));
        //System.out.println(Arrays.toString(testiTaulukko));
        Integer[] VerrokkiTaulu1 = luoUusi(10);

        System.out.println(onkoSamat(VerrokkiTaulu1, testiTaulukko));


        Integer[] AlkuperainenTaulu = luoUusi(10);

        //Koska jarjesta metodi nullaa taulukon alkiot. pitää tehdä kopio.
        Integer[] kopioAlusta = AlkuperainenTaulu;
        int testaus1 = summa(kopioAlusta);
        Integer[]jarjestettuTaulukko = jarjesta(AlkuperainenTaulu);
        int testaus2 = summa(jarjestettuTaulukko);
        System.out.println("Kopion summa: " + testaus1);
        System.out.println("Järjestetyn taulukon summa: " + testaus2);
        System.out.println(Arrays.toString(jarjestettuTaulukko));
        boolean kasvava =((onkoKasvava(jarjestettuTaulukko)));
        System.out.println(kasvava);
        System.out.println(Arrays.toString(jarjestettuTaulukko));




    }
}
