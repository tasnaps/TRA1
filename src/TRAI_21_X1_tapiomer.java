/*
    Kirjoita algoritmi joka palauttaa Integer listan pienimmän ja suurimman luvun summan.
 */

import java.util.Arrays;

class TRAI_21_XI_tapiomer implements TRA_21_XI {

    //Palauttaa pienimmän ja suurimman luvun summan
    //Jos yksi alkio, niin palautetaan se kaksinkertaisena
    //jos tyhjä niin palautetaan null
    static boolean tarkistus(Integer[] taulu){
        boolean eiNull = false;
        if(Arrays.stream(taulu).findAny().isPresent()){
           eiNull = true;
        }
        return eiNull;
    }

    static Integer tulostaSumma(Integer[] A){
        int indeksi= 0;
        int pienin= Integer.MAX_VALUE;
        int suurin = Integer.MIN_VALUE;
        int total = A.length;
        if(tarkistus(A)){
            while(indeksi<total){
                try {
                    if((pienin>A[indeksi])){
                        pienin = A[indeksi];
                    }
                    indeksi++;
                } catch (NullPointerException exception){
                    indeksi++;
                }
            }
            indeksi = 0;
            while(indeksi<total){
                try {
                    if((suurin<A[indeksi])){
                        suurin = A[indeksi];
                    }
                    indeksi++;
                } catch (NullPointerException exception){
                    indeksi++;
                }
            }
        }else {
            return null;
        }


        int summa = pienin + suurin;
        return summa;
    }

    public static void main(String[] args) {
        Integer [] lista = new Integer[]{1,2,3,4,5};
        Integer [] yksi = new Integer[]{6};
        Integer pienin = tulostaSumma(lista);
        Integer yksin = tulostaSumma(yksi);
        Integer [] tyhja = new Integer[]{};
        Integer testi = tulostaSumma(tyhja);
        System.out.println(testi);
        //System.out.println(pienin);

    }
}
